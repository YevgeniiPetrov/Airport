package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.impl.RequestPassengerDTOImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface PassengerController {
    ResponsePassengerDTO get(@RequestParam int id);
    ResponsePassengerDTO add(@RequestBody RequestPassengerDTOImpl requestPassengerDTO);
}
