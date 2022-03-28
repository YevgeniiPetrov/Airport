package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployee {
    public static Employee getEmployee() {
        return TestEntity.getEntity(new DAOFactoryImpl().getEmployeeDAO());
    }

    @Test
    void testPost() {
        Assertions.assertDoesNotThrow(() -> getEmployee().getPost());
    }

    @Test
    void testTerminals() {
        Assertions.assertDoesNotThrow(() -> getEmployee().getTerminals());
    }

    @Test
    void testPlanes() {
        Assertions.assertDoesNotThrow(() -> getEmployee().getPlanes());
    }
}
