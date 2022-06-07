package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.entity.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketService {
    ResponseTicketDTO get(int id);
    ResponseCompleted add(RequestTicketDTO requestTicketCreationDTO);
    List<ResponseTicketDTO> getTicketsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
    ResponseCompleted delete(Ticket ticket);
}
