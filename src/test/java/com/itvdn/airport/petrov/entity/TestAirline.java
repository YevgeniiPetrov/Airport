package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAirline {
    public static Airline getAirline() {
        return TestEntity.getEntity(new DAOFactoryImpl().getAirlineDAO());
    }

    @Test
    void testFlights() {
        Assertions.assertDoesNotThrow(() -> getAirline().getFlights());
    }

    @Test
    void testPlanes() {
        Assertions.assertDoesNotThrow(() -> getAirline().getPlanes());
    }
}
