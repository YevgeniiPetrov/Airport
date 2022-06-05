package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.impl.RequestPassengerDTOImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

public interface PassengerController {
    ResponsePassengerDTO get(@RequestParam int id);
    ResponseCompleted create(@RequestBody @Valid RequestPassengerDTOImpl requestPassengerDTO);
}
