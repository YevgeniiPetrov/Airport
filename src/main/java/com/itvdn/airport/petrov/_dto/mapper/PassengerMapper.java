package com.itvdn.airport.petrov._dto.mapper;

import com.itvdn.airport.petrov._dto.RequestPassengerDTO;
import com.itvdn.airport.petrov._dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.entity.Passenger;

public interface PassengerMapper {
    ResponsePassengerDTO passengerToMap(Passenger passenger);
    Passenger mapToPassenger(RequestPassengerDTO requestPassengerDTO);
}
