package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponseRouteDTO;
import com.itvdn.airport.petrov.dto.ResponseStateDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseFlightDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.dto.mapper.RouteMapper;
import com.itvdn.airport.petrov.dto.mapper.StateMapper;
import com.itvdn.airport.petrov.entity.Flight;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FlightMapperImpl implements FlightMapper {
    private RouteMapper routeMapper;
    private StateMapper stateMapper;

    @Override
    public ResponseFlightDTO flightToMap(Flight flight) {
        ResponseRouteDTO route = routeMapper.routeToMap(flight.getRoute());
        ResponseStateDTO state = stateMapper.stateToMap(flight.getState());
        return ResponseFlightDTOImpl.builder()
                .id(flight.getId())
                .departure(flight.getDeparture())
                .arrival(flight.getArrival())
                .route(route)
                .state(state)
                .build();
    }
}
