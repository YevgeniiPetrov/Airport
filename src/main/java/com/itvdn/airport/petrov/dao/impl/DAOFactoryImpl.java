package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.dao.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DAOFactoryImpl implements DAOFactory {
    private AirlineDAO airlineDAO;
    private EmployeeDAO employeeDAO;
    private FlightDAO flightDAO;
    private PassengerDAO passengerDAO;
    private PlaneDAO planeDAO;
    private PostDAO postDAO;
    private RouteDAO routeDAO;
    private StateDAO stateDAO;
    private TerminalDAO terminalDAO;
    private TicketDAO ticketDAO;

    @Override
    public AirlineDAO getAirlineDAO() {
        return airlineDAO;
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    @Override
    public FlightDAO getFlightDAO() {
        return flightDAO;
    }

    @Override
    public PassengerDAO getPassengerDAO() {
        return passengerDAO;
    }

    @Override
    public PlaneDAO getPlaneDAO() {
        return planeDAO;
    }

    @Override
    public PostDAO getPostDAO() {
        return postDAO;
    }

    @Override
    public RouteDAO getRouteDAO() {
        return routeDAO;
    }

    @Override
    public StateDAO getStateDAO() {
        return stateDAO;
    }

    @Override
    public TerminalDAO getTerminalDAO() {
        return terminalDAO;
    }

    @Override
    public TicketDAO getTicketDAO() {
        return ticketDAO;
    }
}
