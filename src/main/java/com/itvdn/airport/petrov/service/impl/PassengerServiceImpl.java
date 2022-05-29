package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.service.PassengerService;
import com.itvdn.airport.petrov.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PassengerServiceImpl implements PassengerService {
    private ServiceFactory serviceFactory;

    @Override
    public Passenger add(Passenger passenger) {
        return serviceFactory.getPassengerService().add(passenger);
    }
}
