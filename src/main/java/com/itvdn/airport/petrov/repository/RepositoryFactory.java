package com.itvdn.airport.petrov.repository;

public interface RepositoryFactory {
    AirlineRepository getAirlineRepository();
    EmployeeRepository getEmployeeRepository();
    FlightRepository getFlightRepository();
    PassengerRepository getPassengerRepository();
    PlaneRepository getPlaneRepository();
    PostRepository getPostRepository();
    RouteRepository getRouteRepository();
    StateRepository getStateRepository();
    TerminalRepository getTerminalRepository();
    TicketRepository getTicketRepository();
}
