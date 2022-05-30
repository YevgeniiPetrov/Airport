package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.mapper.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class MapperFactoryImpl implements MapperFactory {
    private PassengerMapper passengerMapper;
    private TicketMapper ticketMapper;
    private RouteMapper routeMapper;
    private StateMapper stateMapper;
    private FlightMapper flightMapper;
}
