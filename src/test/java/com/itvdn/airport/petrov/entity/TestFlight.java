package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFlight {
    public static Flight getFlight() {
        return TestEntity.getEntity(new DAOFactoryImpl().getFlightDAO());
    }

    @Test
    void testRoute() {
        Assertions.assertDoesNotThrow(() -> getFlight().getRoute());
    }

    @Test
    void testState() {
        Assertions.assertDoesNotThrow(() -> getFlight().getState());
    }

    @Test
    void testTickets() {
        Assertions.assertDoesNotThrow(() -> getFlight().getTickets());
    }

    @Test
    void testAirlines() {
        Assertions.assertDoesNotThrow(() -> getFlight().getAirlines());
    }

    @Test
    void testPassengers() {
        Assertions.assertDoesNotThrow(() -> getFlight().getPassengers());
    }

    @Test
    void testTerminals() {
        Assertions.assertDoesNotThrow(() -> getFlight().getTerminals());
    }
}
