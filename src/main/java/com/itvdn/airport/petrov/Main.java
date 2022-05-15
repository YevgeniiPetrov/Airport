package com.itvdn.airport.petrov;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;
import com.itvdn.airport.petrov.repository.PassengerRepository;
import com.itvdn.airport.petrov.repository.PlaneRepository;
import com.itvdn.airport.petrov.repository.impl.RepositoryFactoryImpl;

public class Main {
    public static void main(String[] args) {
        PassengerRepository passengerRepository = new RepositoryFactoryImpl().getPassengerRepository();
        System.out.println(passengerRepository.getAllArrived().size());
    }
}
