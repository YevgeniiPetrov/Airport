package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Route;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRouteDAO {
    private static final RouteDAO DAO = new DAOFactoryImpl().getRouteDAO();
    private static final Class<Route> CLASS = Route.class;

    private static Route getRoute() {
        return Route
                .builder()
                .from("Test")
                .to("Test")
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getRoute(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getRoute(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getRoute(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getRoute(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
