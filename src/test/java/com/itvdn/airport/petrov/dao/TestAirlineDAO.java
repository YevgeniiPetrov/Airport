package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAirlineDAO {
    private static final AirlineDAO DAO = new DAOFactoryImpl().getAirlineDAO();
    private static final Class<Airline> CLASS = Airline.class;

    private static Airline getAirline() {
        return Airline
                .builder()
                .title("Test Airline")
                .rating(4.5)
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getAirline(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getAirline(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getAirline(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getAirline(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
