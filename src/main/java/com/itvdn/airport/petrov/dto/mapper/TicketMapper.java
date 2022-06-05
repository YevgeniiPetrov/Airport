package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.RequestPassengerTicketsDTO;
import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.entity.Ticket;

import java.util.List;

public interface TicketMapper {
    ResponseTicketDTO ticketToMap(Ticket ticket);
    Ticket mapToTicket(RequestTicketDTO requestTicketDTO);
    List<RequestTicketDTO> mapToMap(RequestPassengerTicketsDTO requestPassengerTicketsDTO);
    List<ResponseTicketDTO> ticketsToMap(List<Ticket> tickets);
}
