package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TicketDAO;
import com.itvdn.airport.petrov.entity.Ticket;

import java.util.List;

public class TicketDAOImpl implements TicketDAO {
    @Override
    public Ticket get(int id) {
        return DataBase.get(id, Ticket.class);
    }

    @Override
    public boolean delete(Ticket object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Ticket> getAll() {
        return DataBase.getAll(Ticket.class);
    }
}
