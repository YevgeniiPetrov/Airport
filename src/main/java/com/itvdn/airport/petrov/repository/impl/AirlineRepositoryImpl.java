package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Airline;
import com.itvdn.airport.petrov.repository.AirlineRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class AirlineRepositoryImpl implements AirlineRepository {
    private DAOFactory DAOFactory;

    @Override
    public Airline add(Airline object) {
        return DAOFactory.getAirlineDAO().add(object);
    }

    @Override
    public Optional<Airline> get(int id) {
        return DAOFactory.getAirlineDAO().get(id);
    }

    @Override
    public Airline update(Airline object) {
        return DAOFactory.getAirlineDAO().update(object);
    }

    @Override
    public Boolean delete(Airline object) {
        return DAOFactory.getAirlineDAO().delete(object);
    }

    @Override
    public List<Airline> getAll() {
        return DAOFactory.getAirlineDAO().getAll();
    }
}
