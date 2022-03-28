package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.TestRoute;
import com.itvdn.airport.petrov.entity.TestState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class TestFlightDAO {
    private static final FlightDAO DAO = new DAOFactoryImpl().getFlightDAO();
    private static final Class<Flight> CLASS = Flight.class;

    private static Flight getFlight() {
        return Flight
                .builder()
                .departure(LocalTime.of(11, 00))
                .arrival(LocalTime.of(14, 30))
                .route(TestRoute.getRoute())
                .state(TestState.getState())
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getFlight(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getFlight(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getFlight(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getFlight(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
