package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.PassengerController;
import com.itvdn.airport.petrov._dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov._dto.impl.RequestPassengerDTOImpl;
import com.itvdn.airport.petrov.service.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public ResponsePassengerDTO create(@RequestBody RequestPassengerDTOImpl requestPassengerDTO) {
        return passengerService.add(requestPassengerDTO);
    }
}
