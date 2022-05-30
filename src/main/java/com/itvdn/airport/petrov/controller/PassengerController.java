package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.impl.RequestPassengerDTOImpl;
import com.itvdn.airport.petrov.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PassengerController {
    private ServiceFactory serviceFactory;

    @GetMapping("/passenger/get/")
    public ResponsePassengerDTO get(@RequestParam int id) {
        return serviceFactory.getPassengerService().get(id);
    }

    @PostMapping("/passenger/create")
    public ResponsePassengerDTO add(@RequestBody RequestPassengerDTOImpl requestPassengerDTO) {
        return serviceFactory.getPassengerService().add(requestPassengerDTO);
    }
}
