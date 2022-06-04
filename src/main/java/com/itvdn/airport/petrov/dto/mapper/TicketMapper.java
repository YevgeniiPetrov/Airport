package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.RequestTicketCreationDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.entity.Ticket;

public interface TicketMapper {
    ResponseTicketDTO ticketToMap(Ticket ticket);
    Ticket mapToTicket(RequestTicketCreationDTO requestTicketCreationDTO);
}
