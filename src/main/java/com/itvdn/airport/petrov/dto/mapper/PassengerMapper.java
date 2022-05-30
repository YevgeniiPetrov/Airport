package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.entity.Passenger;

public interface PassengerMapper {
    ResponsePassengerDTO passengerToMap(Passenger passenger);
    Passenger mapToPassenger(RequestPassengerDTO requestPassengerDTO);
}
