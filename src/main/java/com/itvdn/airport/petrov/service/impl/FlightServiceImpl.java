package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.repository.FlightRepository;
import com.itvdn.airport.petrov.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {
    private FlightRepository flightRepository;
    private FlightMapper flightMapper;
    private ResponseCompleted responseCompleted;

    @Override
    public List<ResponseFlightDTO> getFlightsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        List<Flight> flights = flightRepository.getAllBetweenDates(dateFrom, dateTo);
        return flightMapper.flightsToMap(flights);
    }

    @Override
    public ResponseCompleted delete(RequestEntityDTO requestEntityDTO) {
        flightRepository.delete(flightMapper.mapToFlight(requestEntityDTO));
        return responseCompleted;
    }
}
