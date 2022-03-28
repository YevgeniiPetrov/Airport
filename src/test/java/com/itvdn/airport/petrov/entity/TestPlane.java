package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPlane {
    public static Plane getPlane() {
        return TestEntity.getEntity(new DAOFactoryImpl().getPlaneDAO());
    }

    @Test
    void testAirline() {
        Assertions.assertDoesNotThrow(() -> getPlane().getAirline());
    }

    @Test
    void testEmployees() {
        Assertions.assertDoesNotThrow(() -> getPlane().getEmployees());
    }
}
