package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponseRouteDTO;
import com.itvdn.airport.petrov.dto.ResponseStateDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseFlightDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.dto.mapper.MapperFactory;
import com.itvdn.airport.petrov.dto.mapper.RouteMapper;
import com.itvdn.airport.petrov.dto.mapper.StateMapper;
import com.itvdn.airport.petrov.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FlightMapperImpl implements FlightMapper {
    private MapperFactory mapperFactory;

    @Autowired
    public FlightMapperImpl(@Lazy MapperFactory mapperFactory) {
        this.mapperFactory = mapperFactory;
    }

    @Override
    public ResponseFlightDTO flightToMap(Flight flight) {
        RouteMapper routeMapper = mapperFactory.getRouteMapper();
        ResponseRouteDTO route = routeMapper.routeToMap(flight.getRoute());
        StateMapper stateMapper = mapperFactory.getStateMapper();
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
