package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Plane;
import com.itvdn.airport.petrov.entity.TestAirline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPlaneDAO {
    private static final PlaneDAO DAO = new DAOFactoryImpl().getPlaneDAO();
    private static final Class<Plane> CLASS = Plane.class;

    private static Plane getPlane() {
        return Plane
                .builder()
                .airline(TestAirline.getAirline())
                .title("Test")
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getPlane(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getPlane(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getPlane(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getPlane(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
