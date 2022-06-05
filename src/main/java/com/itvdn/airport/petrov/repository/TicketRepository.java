package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketRepository extends GenericRepository<Ticket> {
    List<Ticket> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
}
