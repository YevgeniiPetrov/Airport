package com.itvdn.airport.petrov;

import com.itvdn.airport.petrov.dao.*;
import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;
import com.itvdn.airport.petrov.entity.State;

public class Main {
    public static void main(String[] args) {
        DAOFactory DAOFactory = new DAOFactoryImpl();
        AirlineDAO airlineDAO = DAOFactory.getAirlineDAO();
        Airline airline = Airline
                .builder()
                .title("Test Airline")
                .rating(4.5)
                .build();
        System.out.println(airline.getId());
        airlineDAO.add(airline);
        System.out.println(airline.getId());
        airlineDAO.get(4).setRemoved(true);
        System.out.println();

    }
}
