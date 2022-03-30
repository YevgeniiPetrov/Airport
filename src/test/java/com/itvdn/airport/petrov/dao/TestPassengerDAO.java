package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestPassengerDAO {
    private static final PassengerDAO DAO = new DAOFactoryImpl().getPassengerDAO();
    private static final Class<Passenger> CLASS = Passenger.class;

    private static Passenger getPassenger() {
        return Passenger
                .builder()
                .firstName("Test")
                .lastName("Test")
                .birthDate(LocalDate.of(1990, 3, 30))
                .passport(12345678)
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getPassenger(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getPassenger(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getPassenger(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getPassenger(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }

    @Test
    void testGetAllArrivedByCriteria() {
        Assertions.assertDoesNotThrow(DAO::getAllArrivedByCriteria);
    }

    @Test
    void testGetAllArrivedByHQL() {
        Assertions.assertDoesNotThrow(DAO::getAllArrivedByHQL);
    }
}
