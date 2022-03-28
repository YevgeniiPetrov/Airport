package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.State;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStateDAO {
    private static final StateDAO DAO = new DAOFactoryImpl().getStateDAO();
    private static final Class<State> CLASS = State.class;

    private static State getState() {
        return State
                .builder()
                .title("Test")
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getState(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getState(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getState(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getState(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
