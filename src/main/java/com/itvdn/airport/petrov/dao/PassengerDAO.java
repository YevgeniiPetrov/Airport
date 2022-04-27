package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.entity.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerDAO extends GenericDAO<Passenger> {
    Optional<List<Passenger>> getAllArrivedByCriteria();
    Optional<List<Passenger>> getAllArrivedByHQL();
}
