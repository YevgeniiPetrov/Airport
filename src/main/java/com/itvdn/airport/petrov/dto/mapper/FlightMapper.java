package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.entity.Flight;

import java.util.List;

public interface FlightMapper {
    ResponseFlightDTO flightToMap(Flight flight);
    Flight mapToFlight(RequestEntityDTO requestEntityDTO);
    List<ResponseFlightDTO> flightsToMap(List<Flight> flights);
}
