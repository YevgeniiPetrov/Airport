package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;

public interface RouteService {
    ResponseCompleted delete(RequestEntityDTO requestEntityDTO);
}
