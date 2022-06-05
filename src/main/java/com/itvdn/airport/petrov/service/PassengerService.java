package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;

public interface PassengerService {
    ResponsePassengerDTO get(int id);
    ResponseCompleted add(RequestPassengerDTO requestPassengerDTO);
}
