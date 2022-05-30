package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.impl.RequestTicketDTOImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface TicketController {
    ResponseTicketDTO get(@RequestParam int id);
    ResponseTicketDTO add(@RequestBody RequestTicketDTOImpl requestTicketDTO);
}
