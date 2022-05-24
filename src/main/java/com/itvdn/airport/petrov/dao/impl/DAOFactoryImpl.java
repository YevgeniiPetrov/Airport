package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.dao.*;

public class DAOFactoryImpl implements DAOFactory {
    @Override
    public AirlineDAO getAirlineDAO() {
        return new AirlineDAOImpl();
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        return new EmployeeDAOImpl();
    }

    @Override
    public FlightDAO getFlightDAO() {
        return new FlightDAOImpl();
    }

    @Override
    public PassengerDAO getPassengerDAO() {
        return new PassengerDAOImpl();
    }

    @Override
    public PlaneDAO getPlaneDAO() {
        return new PlaneDAOImpl();
    }

    @Override
    public PostDAO getPostDAO() {
        return new PostDAOImpl();
    }

    @Override
    public RouteDAO getRouteDAO() {
        return new RouteDAOImpl();
    }

    @Override
    public StateDAO getStateDAO() {
        return new StateDAOImpl();
    }

    @Override
    public TerminalDAO getTerminalDAO() {
        return new TerminalDAOImpl();
    }

    @Override
    public TicketDAO getTicketDAO() {
        return new TicketDAOImpl();
    }
}
