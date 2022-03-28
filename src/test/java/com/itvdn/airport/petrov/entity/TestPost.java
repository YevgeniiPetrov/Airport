package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPost {
    public static Post getPost() {
        return TestEntity.getEntity(new DAOFactoryImpl().getPostDAO());
    }

    @Test
    void testEmployees() {
        Assertions.assertDoesNotThrow(() -> getPost().getEmployees());
    }
}
