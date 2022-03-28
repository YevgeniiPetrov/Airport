package com.itvdn.airport.petrov.dao;

public interface DAOFactory {
    AirlineDAO getAirlineDAO();
    EmployeeDAO getEmployeeDAO();
    FlightDAO getFlightDAO();
    PassengerDAO getPassengerDAO();
    PlaneDAO getPlaneDAO();
    PostDAO getPostDAO();
    RouteDAO getRouteDAO();
    StateDAO getStateDAO();
    TerminalDAO getTerminalDAO();
    TicketDAO getTicketDAO();
}
