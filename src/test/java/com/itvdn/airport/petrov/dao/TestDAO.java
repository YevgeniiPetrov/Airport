package com.itvdn.airport.petrov.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDAO {
    private static final String GET_ID_METHOD = "getId";
    private static final String SET_REMOVED_METHOD = "setRemoved";

    private static <T> int getId(T object, Class<T> type) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getIdMethod = type.getMethod(GET_ID_METHOD);
        return (int) getIdMethod.invoke(object);
    }

    private static <T> void setRemoved(T object, Class<T> type) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method setRemovedMethod = type.getMethod(SET_REMOVED_METHOD, Boolean.class);
        setRemovedMethod.invoke(object, true);
    }

    public static <T> boolean testAdd(GenericDAO<T> genericDAO, T object, Class<T> type) {
        try {
            int objectId = getId(object, type);
            T objectFromDAO = genericDAO.add(object);
            boolean result = objectId == 0 && getId(objectFromDAO, type) != 0;
            genericDAO.delete(object);
            return result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static <T> boolean testGet(GenericDAO<T> genericDAO, T object, Class<T> type)  {
        try {
            genericDAO.add(object);
            int objectId = getId(object, type);
            T objectFromDAO = genericDAO.get(objectId);
            boolean result = getId(objectFromDAO, type) == objectId;
            genericDAO.delete(object);
            return result;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static <T> boolean testUpdate(GenericDAO<T> genericDAO, T object, Class<T> type) {
        try {
            genericDAO.add(object);
            setRemoved(object, type);
            int objectId = getId(object, type);
            T objectFromDAO = genericDAO.update(object);
            boolean result = getId(objectFromDAO, type) == objectId;
            genericDAO.delete(object);
            return result;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static <T> boolean testDelete(GenericDAO<T> genericDAO, T object, Class<T> type) {
        try {
            genericDAO.add(object);
            int objectId = getId(object, type);
            T objectFromDAO = genericDAO.get(objectId);
            boolean isDelete = genericDAO.delete(object);
            return getId(objectFromDAO, type) != 0 && isDelete;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static <T> boolean testGetAll(GenericDAO<T> genericDAO) {
        return genericDAO.getAll().size() != -1;
    }
}
