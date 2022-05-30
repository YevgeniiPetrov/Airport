package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.PassengerController;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.impl.RequestPassengerDTOImpl;
import com.itvdn.airport.petrov.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PassengerControllerImpl implements PassengerController {
    private ServiceFactory serviceFactory;

    @Override
    @GetMapping("/passenger/get/")
    public ResponsePassengerDTO get(@RequestParam int id) {
        return serviceFactory.getPassengerService().get(id);
    }

    @Override
    @PostMapping("/passenger/create")
    public ResponsePassengerDTO add(@RequestBody RequestPassengerDTOImpl requestPassengerDTO) {
        return serviceFactory.getPassengerService().add(requestPassengerDTO);
    }
}
