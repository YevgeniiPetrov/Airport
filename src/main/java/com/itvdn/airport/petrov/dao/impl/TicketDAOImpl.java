package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TicketDAO;
import com.itvdn.airport.petrov.entity.Ticket;

import java.util.List;
import java.util.Optional;

public class TicketDAOImpl implements TicketDAO {
    @Override
    public Optional<Ticket> get(int id) {
        return new DataBase<Ticket>().get(id, Ticket.class);
    }

    @Override
    public List<Ticket> getAll() {
        return new DataBase<Ticket>().getAll(Ticket.class);
    }
}
