package com.itvdn.airport.petrov;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;

public class Main {
    public static void main(String[] args) {
        DAOFactory daoFactory = new DAOFactoryImpl();
        AirlineDAO airlineDAO = daoFactory.getAirlineDAO();
        Airline airline = (Airline) airlineDAO.get(3).get();
        System.out.println(airline.getRemoved());
        airlineDAO.delete(airline);
        System.out.println(airline.getRemoved());
        System.out.println(airlineDAO.getAll().size());
    }
}
