package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RequestPassengerDTOImpl implements RequestPassengerDTO {
    private ServiceFactory serviceFactory;

    @Override
    public Passenger add(Passenger passenger) {
        return serviceFactory.getPassengerService().add(passenger);
    }
}
