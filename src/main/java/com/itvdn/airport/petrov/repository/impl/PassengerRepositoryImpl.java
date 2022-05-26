package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.repository.PassengerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
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
        return new DAOFactoryImpl().getPassengerDAO().update(object);
    }

    @Override
    public Boolean delete(Passenger object) {
        return new DAOFactoryImpl().getPassengerDAO().delete(object);
    }

    @Override
    public List<Passenger> getAll() {
        return new DAOFactoryImpl().getPassengerDAO().getAll();
    }

    @Override
    public List<Passenger> getAllArrived() {
        return new DAOFactoryImpl().getPassengerDAO().getAllArrivedByHQL();
    }
}
