package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Ticket;
import com.itvdn.airport.petrov.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

public class TicketRepositoryImpl implements TicketRepository {
    @Override
    public Ticket add(Ticket object) {
        return new DAOFactoryImpl().getTicketDAO().add(object);
    }

    @Override
    public Optional<Ticket> get(int id) {
        return new DAOFactoryImpl().getTicketDAO().get(id);
    }

    @Override
    public Ticket update(Ticket object) {
        return new DAOFactoryImpl().getTicketDAO().update(object);
    }

    @Override
    public Boolean delete(Ticket object) {
        return new DAOFactoryImpl().getTicketDAO().delete(object);
    }

    @Override
    public List<Ticket> getAll() {
        return new DAOFactoryImpl().getTicketDAO().getAll();
    }
}
