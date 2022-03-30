package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.entity.Passenger;

import javax.persistence.Tuple;
import java.util.List;

public interface PassengerDAO extends GenericDAO<Passenger> {
    List<Passenger> getAllArrivedByCriteria();
    List<Passenger> getAllArrivedByHQL();
}
