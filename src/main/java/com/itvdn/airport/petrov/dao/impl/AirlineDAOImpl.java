package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.entity.Airline;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class AirlineDAOImpl implements AirlineDAO {
    private DataBase<Airline> dataBase;

    @Override
    public Optional<Airline> get(int id) {
        return dataBase.get(id, Airline.class);
    }

    @Override
    public List<Airline> getAll() {
        return dataBase.getAll(Airline.class);
    }
}
