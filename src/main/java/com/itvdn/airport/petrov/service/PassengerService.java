package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov.dto.*;

public interface PassengerService {
    ResponsePassengerDTO get(int id);
    ResponseCompleted add(RequestPassengerDTO requestPassengerDTO);
    ResponseCompleted addTickets(RequestPassengerTicketsDTO requestPassengerTicketsDTO);
    ResponseCompleted delete(RequestEntityDTO requestEntityDTO);
}
