package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Route;
import com.itvdn.airport.petrov.repository.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class FlightRepositoryImpl implements FlightRepository {
    private DAOFactory DAOFactory;

    @Override
    public Flight add(Flight object) {
        return DAOFactory.getFlightDAO().add(object);
    }

    @Override
    public Optional<Flight> get(int id) {
        return DAOFactory.getFlightDAO().get(id);
    }

    @Override
    public Flight update(Flight object) {
        return DAOFactory.getFlightDAO().update(object);
    }

    @Override
    public Boolean delete(Flight object) {
        return DAOFactory.getFlightDAO().delete(object);
    }

    @Override
    public List<Flight> getAll() {
        return DAOFactory.getFlightDAO().getAll();
    }

    @Override
    public List<Flight> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return DAOFactory.getFlightDAO().getAllBetweenDates(dateFrom, dateTo);
    }

    @Override
    public List<Flight> getAllByRoute(Route route) {
        return DAOFactory.getFlightDAO().getAllByRoute(route);
    }
}
