package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.entity.Flight;

public interface FlightMapper {
    ResponseFlightDTO flightToMap(Flight flight);
    Flight mapToFlight(RequestEntityDTO requestEntityDTO);
}
