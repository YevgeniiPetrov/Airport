package com.itvdn.airport.petrov;

import com.itvdn.airport.petrov.repository.FlightRepository;
import com.itvdn.airport.petrov.repository.RepositoryFactory;
import com.itvdn.airport.petrov.repository.impl.RepositoryFactoryImpl;

public class Main {
    public static void main(String[] args) {
        RepositoryFactory repositoryFactory = new RepositoryFactoryImpl();
        FlightRepository flightRepository = repositoryFactory.getFlightRepository();
        System.out.println(flightRepository.getWithAirlinesAndTerminals(11).getAirlines());
    }
}
