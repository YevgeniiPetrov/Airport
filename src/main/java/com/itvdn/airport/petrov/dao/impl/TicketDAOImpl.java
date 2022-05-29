package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TicketDAO;
import com.itvdn.airport.petrov.entity.Ticket;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class TicketDAOImpl implements TicketDAO {
    private DataBase<Ticket> dataBase;

    @Override
    public Optional<Ticket> get(int id) {
        return dataBase.get(id, Ticket.class);
    }

    @Override
    public List<Ticket> getAll() {
        return dataBase.getAll(Ticket.class);
    }
}
