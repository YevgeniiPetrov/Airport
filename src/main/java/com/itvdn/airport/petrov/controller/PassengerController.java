package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.dto.RequestPassengerTicketsDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

public interface PassengerController {
    ResponsePassengerDTO get(@RequestParam int id);
    ResponseCompleted create(@RequestBody @Valid RequestPassengerDTO requestPassengerDTO);
    ResponseCompleted createTickets(@RequestBody @Valid RequestPassengerTicketsDTO requestPassengerTicketsDTO);
}
