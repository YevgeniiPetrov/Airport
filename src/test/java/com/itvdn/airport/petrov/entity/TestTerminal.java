package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTerminal {
    public static Terminal getTerminal() {
        return TestEntity.getEntity(new DAOFactoryImpl().getTerminalDAO());
    }

    @Test
    void testEmployees() {
        Assertions.assertDoesNotThrow(() -> getTerminal().getEmployees());
    }

    @Test
    void testFlights() {
        Assertions.assertDoesNotThrow(() -> getTerminal().getFlights());
    }
}
