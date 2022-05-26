package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.repository.PassengerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PassengerController {
    private PassengerRepository repository;

    @GetMapping("/passenger/get/{passengerId}")
    public String getPassengerFirstName(@PathVariable int passengerId) {
        return repository.get(passengerId).get().getFirstName();
    }
}
