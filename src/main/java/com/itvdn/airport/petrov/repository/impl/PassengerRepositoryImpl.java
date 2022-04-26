package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.repository.PassengerRepository;

import java.util.List;

public class PassengerRepositoryImpl implements PassengerRepository {
    @Override
    public Passenger getWithTickets(int id) {
        return new DAOFactoryImpl().getPassengerDAO().get(id, "tickets");
    }

    @Override
    public Passenger getWithFlights(int id) {
        return new DAOFactoryImpl().getPassengerDAO().get(id, "flights");
    }

    @Override
    public Passenger getWithTicketsAndFlights(int id) {
        return new DAOFactoryImpl().getPassengerDAO().get(id, "tickets", "flights");
    }

    @Override
    public List<Passenger> getAllWithTickets() {
        return new DAOFactoryImpl().getPassengerDAO().getAll("tickets");
    }

    @Override
    public List<Passenger> getAllWithFlights() {
        return new DAOFactoryImpl().getPassengerDAO().getAll("flights");
    }

    @Override
    public List<Passenger> getAllWithTicketsAndFlights() {
        return new DAOFactoryImpl().getPassengerDAO().getAll("tickets", "flights");
    }
}
