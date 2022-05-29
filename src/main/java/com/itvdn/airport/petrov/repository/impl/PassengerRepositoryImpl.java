package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.repository.PassengerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PassengerRepositoryImpl implements PassengerRepository {
    private DAOFactory daoFactory;

    @Override
    public Passenger add(Passenger object) {
        return daoFactory.getPassengerDAO().add(object);
    }

    @Override
    public Optional<Passenger> get(int id) {
        return daoFactory.getPassengerDAO().get(id);
    }

    @Override
    public Passenger update(Passenger object) {
        return daoFactory.getPassengerDAO().update(object);
    }

    @Override
    public Boolean delete(Passenger object) {
        return daoFactory.getPassengerDAO().delete(object);
    }

    @Override
    public List<Passenger> getAll() {
        return daoFactory.getPassengerDAO().getAll();
    }

    @Override
    public List<Passenger> getAllArrived() {
        return daoFactory.getPassengerDAO().getAllArrivedByHQL();
    }
}
