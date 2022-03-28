package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestState {
    public static State getState() {
        return TestEntity.getEntity(new DAOFactoryImpl().getStateDAO());
    }

    @Test
    void testFlights() {
        Assertions.assertDoesNotThrow(() -> getState().getFlights());
    }
}
