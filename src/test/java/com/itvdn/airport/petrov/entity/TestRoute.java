package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRoute {
    public static Route getRoute() {
        return TestEntity.getEntity(new DAOFactoryImpl().getRouteDAO());
    }

    @Test
    void testFlights() {
        Assertions.assertDoesNotThrow(() -> getRoute().getFlights());
    }
}
