package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PassengerDAO;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.entity.State;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.List;
import java.util.Optional;

public class PassengerDAOImpl implements PassengerDAO {
    @Override
    public Optional<Passenger> get(int id) {
        return new DataBase<Passenger>().get(id, Passenger.class);
    }

    @Override
    public List<Passenger> getAll() {
        return new DataBase<Passenger>().getAll(Passenger.class);
    }

    @Override
    public List<Passenger> getAllArrivedByCriteria() {
        Session session = new DataBase<Passenger>().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Passenger> criteriaQuery = criteriaBuilder.createQuery(Passenger.class);
        Root<Passenger> passengerRoot = criteriaQuery.from(Passenger.class);
        Join<Passenger, Flight> flightJoin = passengerRoot.join("flights");
        Join<Flight, State> stateJoin = flightJoin.join("state");
        criteriaQuery.multiselect(passengerRoot, flightJoin, stateJoin);
        ParameterExpression<String> stateTitle = criteriaBuilder.parameter(String.class);
        criteriaQuery.select(passengerRoot)
                .where(criteriaBuilder.equal(stateJoin.get("title"), stateTitle));
        Query query = session.createQuery(criteriaQuery);
        query.setParameter(stateTitle, "arrived");
        List<Passenger> list = query.getResultList();
        transaction.commit();
        session.close();
        return list;
    }


    @Override
    public List<Passenger> getAllArrivedByHQL() {
        Session session = new DataBase<Passenger>().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StringBuilder queryStr = new StringBuilder()
                .append("select p ")
                .append("from Passenger p ")
                .append("join p.flights f ")
                .append("join f.state s ")
                .append("where s.title = 'arrived'");
        List<Passenger> list = session.createQuery(queryStr.toString()).getResultList();
        transaction.commit();
        session.close();
        return list;
    }
}
