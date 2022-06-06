package com.itvdn.airport.petrov.service;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightService {
    List<ResponseFlightDTO> getFlightsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
    ResponseCompleted delete(RequestEntityDTO requestEntityDTO);
}
