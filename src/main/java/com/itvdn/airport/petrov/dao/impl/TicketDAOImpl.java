package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TicketDAO;
import com.itvdn.airport.petrov.entity.Ticket;

import java.util.List;
import java.util.Optional;

public class TicketDAOImpl implements TicketDAO {
    @Override
    public Optional<Ticket> get(int id, String... getters) {
        return new DataBase<Ticket>().get(id, Ticket.class, getters);
    }

    @Override
    public boolean delete(Ticket object) {
        new DataBase<Ticket>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Ticket>> getAll(String... fields) {
        return new DataBase<Ticket>().getAll(Ticket.class, fields);
    }
}
