package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Ticket;
import com.itvdn.airport.petrov.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class TicketRepositoryImpl implements TicketRepository {
    private DAOFactory DAOFactory;

    @Override
    public Ticket add(Ticket object) {
        return DAOFactory.getTicketDAO().add(object);
    }

    @Override
    public Optional<Ticket> get(int id) {
        return DAOFactory.getTicketDAO().get(id);
    }

    @Override
    public Ticket update(Ticket object) {
        return DAOFactory.getTicketDAO().update(object);
    }

    @Override
    public Boolean delete(Ticket object) {
        return DAOFactory.getTicketDAO().delete(object);
    }

    @Override
    public List<Ticket> getAll() {
        return DAOFactory.getTicketDAO().getAll();
    }

    @Override
    public List<Ticket> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return DAOFactory.getTicketDAO().getAllBetweenDates(dateFrom, dateTo);
    }

    @Override
    public List<Ticket> getAllByFlight(Flight flight) {
        return DAOFactory.getTicketDAO().getAllByFlight(flight);
    }
}
