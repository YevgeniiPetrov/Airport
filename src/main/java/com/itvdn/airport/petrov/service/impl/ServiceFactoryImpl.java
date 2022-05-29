package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.service.PassengerService;
import com.itvdn.airport.petrov.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceFactoryImpl implements ServiceFactory {
    private PassengerService passengerService;

    @Override
    public PassengerService getPassengerService() {
        return passengerService;
    }
}
