package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;

public interface TicketService {
    ResponseTicketDTO get(int id);
    ResponseTicketDTO add(RequestTicketDTO requestTicketDTO);
}
