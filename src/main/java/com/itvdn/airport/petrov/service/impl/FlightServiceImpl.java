package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.RequestFlightChangeDeparture;
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
    public ResponseCompleted delete(Flight flight) {
        flightRepository.delete(flight);
        return responseCompleted;
    }

    @Override
    public ResponseCompleted delete(RequestEntityDTO requestEntityDTO) {
        Flight flight = flightRepository.get(requestEntityDTO.getId()).get();
        return delete(flight);
    }

    @Override
    public ResponseCompleted update(RequestFlightChangeDeparture requestFlightChangeDeparture) {
        Flight flight = flightRepository.get(requestFlightChangeDeparture.getId()).get();
        flight.setDeparture(requestFlightChangeDeparture.getDeparture());
        flightRepository.update(flight);
        return responseCompleted;
    }
}
