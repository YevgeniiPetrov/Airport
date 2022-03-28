package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.TestFlight;
import com.itvdn.airport.petrov.entity.TestPassenger;
import com.itvdn.airport.petrov.entity.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTicketDAO {
    private static final TicketDAO DAO = new DAOFactoryImpl().getTicketDAO();
    private static final Class<Ticket> CLASS = Ticket.class;

    private static Ticket getTicket() {
        return Ticket
                .builder()
                .number(11111)
                .place(25)
                .passenger(TestPassenger.getPassenger())
                .flight(TestFlight.getFlight())
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getTicket(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getTicket(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getTicket(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getTicket(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
