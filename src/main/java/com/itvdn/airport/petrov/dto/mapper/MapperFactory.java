package com.itvdn.airport.petrov.dto.mapper;

public interface MapperFactory {
    PassengerMapper getPassengerMapper();
    TicketMapper getTicketMapper();
    RouteMapper getRouteMapper();
    StateMapper getStateMapper();
    FlightMapper getFlightMapper();
}
