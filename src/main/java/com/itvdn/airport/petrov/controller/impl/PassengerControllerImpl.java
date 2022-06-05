package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.PassengerController;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.impl.RequestPassengerDTOImpl;
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
    public ResponseCompleted create(@RequestBody @Valid RequestPassengerDTOImpl requestPassengerDTO) {
        return passengerService.add(requestPassengerDTO);
    }
}
