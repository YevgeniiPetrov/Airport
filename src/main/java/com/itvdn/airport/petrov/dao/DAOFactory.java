package com.itvdn.airport.petrov.dao;

public interface DAOFactory {
    AirlineDAO getAirlineDAO();
    EmployeeDAO getEmployeeDAO();
    FlightDAO getFlightDAO();
    PassengerDAO getPassengerDAO();
    PostDAO getPostDAO();
    RouteDAO getRouteDAO();
    StateDAO getSTateDAO();
    TerminalDAO getTerminalDAO();
    TicketDAO getTicketDAO();
}
