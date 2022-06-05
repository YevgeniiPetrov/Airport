package com.itvdn.airport.petrov.service.impl;

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

    @Override
    public List<ResponseFlightDTO> getFlightsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        List<Flight> flights = flightRepository.getAllBetweenDates(dateFrom, dateTo);
        return flightMapper.flightsToMap(flights);
    }
}
