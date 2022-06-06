package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.PassengerController;
import com.itvdn.airport.petrov.dto.*;
import com.itvdn.airport.petrov.service.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class PassengerControllerImpl implements PassengerController {
    private PassengerService passengerService;

    @Override
    @GetMapping("/passenger/get/")
    public ResponsePassengerDTO get(@RequestParam int id) {
        return passengerService.get(id);
    }

    @Override
    @PostMapping("/passenger/create")
    public ResponseCompleted create(@RequestBody @Valid RequestPassengerDTO requestPassengerDTO) {
        return passengerService.add(requestPassengerDTO);
    }

    @Override
    @PostMapping("/passenger/tickets/create")
    public ResponseCompleted createTickets(@RequestBody @Valid RequestPassengerTicketsDTO requestPassengerTicketsDTO) {
        return passengerService.addTickets(requestPassengerTicketsDTO);
    }

    @Override
    @DeleteMapping("/passenger/delete")
    public ResponseCompleted delete(@RequestBody @Valid RequestEntityDTO requestEntityDTO) {
        return passengerService.delete(requestEntityDTO);
    }
}
