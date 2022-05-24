package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.repository.*;

public class RepositoryFactoryImpl implements RepositoryFactory {
    @Override
    public AirlineRepository getAirlineRepository() {
        return new AirlineRepositoryImpl();
    }

    @Override
    public EmployeeRepository getEmployeeRepository() {
        return new EmployeeRepositoryImpl();
    }

    @Override
    public FlightRepository getFlightRepository() {
        return new FlightRepositoryImpl();
    }

    @Override
    public PassengerRepository getPassengerRepository() {
        return new PassengerRepositoryImpl();
    }

    @Override
    public PlaneRepository getPlaneRepository() {
        return new PlaneRepositoryImpl();
    }

    @Override
    public PostRepository getPostRepository() {
        return new PostRepositoryImpl();
    }

    @Override
    public RouteRepository getRouteRepository() {
        return new RouteRepositoryImpl();
    }

    @Override
    public StateRepository getStateRepository() {
        return new StateRepositoryImpl();
    }

    @Override
    public TerminalRepository getTerminalRepository() {
        return new TerminalRepositoryImpl();
    }

    @Override
    public TicketRepository getTicketRepository() {
        return new TicketRepositoryImpl();
    }
}
