package com.itvdn.airport.petrov;

import com.itvdn.airport.petrov.dao.*;
import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.State;

public class Main {
    public static void main(String[] args) {
        DAOFactory DAOFactory = new DAOFactoryImpl();
        EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
        StateDAO stateDAO = DAOFactory.getSTateDAO();
        System.out.println(stateDAO.getAll().get(1).getFlights().size());
        State state = State
                .builder()
                .title("test")
                .build();
        State state1 = stateDAO.get(2);
        state1.setRemoved(true);
        TicketDAO ticketDAO = DAOFactory.getTicketDAO();
        ticketDAO.getAll().stream()
                .filter(t -> t.getFlight().getState().getId() == 2)
                .forEach(ticketDAO::delete);
        FlightDAO flightDAO = DAOFactory.getFlightDAO();
        flightDAO.getAll().stream()
                .filter(f -> f.getState().getId() == 2)
                        .forEach(flightDAO::delete);
        stateDAO.delete(state1);
        RouteDAO routeDAO = DAOFactory.getRouteDAO();
        System.out.println(routeDAO.getAll().get(1).getFlights());
    }
}
