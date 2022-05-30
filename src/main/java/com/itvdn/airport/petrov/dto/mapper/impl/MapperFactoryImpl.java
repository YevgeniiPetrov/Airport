package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.mapper.MapperFactory;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MapperFactoryImpl implements MapperFactory {
    private PassengerMapper passengerMapper;

    @Override
    public PassengerMapper getPassengerMapper() {
        return passengerMapper;
    }
}
