package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.repository.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RepositoryFactoryImpl implements RepositoryFactory {
    private AirlineRepository airlineRepository;
    private EmployeeRepository employeeRepository;
    private FlightRepository flightRepository;
    private PassengerRepository passengerRepository;
    private PlaneRepository planeRepository;
    private PostRepository postRepository;
    private RouteRepository routeRepository;
    private StateRepository stateRepository;
    private TerminalRepository terminalRepository;
    private TicketRepository ticketRepository;

    @Override
    public AirlineRepository getAirlineRepository() {
        return airlineRepository;
    }

    @Override
    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Override
    public FlightRepository getFlightRepository() {
        return flightRepository;
    }

    @Override
    public PassengerRepository getPassengerRepository() {
        return passengerRepository;
    }

    @Override
    public PlaneRepository getPlaneRepository() {
        return planeRepository;
    }

    @Override
    public PostRepository getPostRepository() {
        return postRepository;
    }

    @Override
    public RouteRepository getRouteRepository() {
        return routeRepository;
    }

    @Override
    public StateRepository getStateRepository() {
        return stateRepository;
    }

    @Override
    public TerminalRepository getTerminalRepository() {
        return terminalRepository;
    }

    @Override
    public TicketRepository getTicketRepository() {
        return ticketRepository;
    }
}
