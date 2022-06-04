package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov._dto.RequestPassengerDTO;
import com.itvdn.airport.petrov._dto.ResponsePassengerDTO;

public interface PassengerService {
    ResponsePassengerDTO get(int id);
    ResponsePassengerDTO add(RequestPassengerDTO requestPassengerDTO);
}
