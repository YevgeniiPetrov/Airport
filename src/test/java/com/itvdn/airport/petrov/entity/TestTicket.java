package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTicket {
    public static Ticket getTicket() {
        return TestEntity.getEntity(new DAOFactoryImpl().getTicketDAO());
    }

    @Test
    void testPassenger() {
        Assertions.assertDoesNotThrow(() -> getTicket().getPassenger());
    }

    @Test
    void testFlight() {
        Assertions.assertDoesNotThrow(() -> getTicket().getFlight());
    }
}
