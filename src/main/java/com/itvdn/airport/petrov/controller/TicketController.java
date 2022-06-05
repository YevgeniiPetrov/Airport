package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

public interface TicketController {
    ResponseTicketDTO get(@RequestParam int id);
    ResponseCompleted create(@RequestBody @Valid RequestTicketDTO requestTicketDTO);
}
