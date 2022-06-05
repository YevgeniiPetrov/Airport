package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.entity.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketDAO extends GenericDAO<Ticket> {
    List<Ticket> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
}
