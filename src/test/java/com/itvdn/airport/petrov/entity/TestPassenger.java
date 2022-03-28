package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPassenger {
    public static Passenger getPassenger() {
        return TestEntity.getEntity(new DAOFactoryImpl().getPassengerDAO());
    }

    @Test
    void testTickets() {
        Assertions.assertDoesNotThrow(() -> getPassenger().getTickets());
    }

    @Test
    void testFlights() {
        Assertions.assertDoesNotThrow(() -> getPassenger().getFlights());
    }
}
