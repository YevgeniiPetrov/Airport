package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.FlightDAO;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Route;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class FlightDAOImpl implements FlightDAO {
    private DataBase<Flight> dataBase;

    @Override
    public Optional<Flight> get(int id) {
        return dataBase.get(id, Flight.class);
    }

    @Override
    public List<Flight> getAll() {
        return dataBase.getAll(Flight.class);
    }

    @Override
    public List<Flight> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        Session session = dataBase.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StringBuilder queryStr = new StringBuilder()
                .append("select f ")
                .append("from Flight f ")
                .append("where f.departure between :dateFrom and :dateTo");
        Query query = session.createQuery(queryStr.toString());
        query.setParameter("dateFrom", dateFrom);
        query.setParameter("dateTo", dateTo);
        List<Flight> list = query.getResultList();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public List<Flight> getAllByRoute(Route route) {
        return getAll().stream().filter(f -> f.getRoute().getId() == route.getId()).toList();
//        Session session = dataBase.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        StringBuilder queryStr = new StringBuilder()
//                .append("select f ")
//                .append("from Flight f ")
//                .append("where f.route = :routeId ")
//                .append("and f.removed = false");
//        Query query = session.createQuery(queryStr.toString());
//        query.setParameter("routeId", route.getId());
//        List<Flight> list = query.getResultList();
//        transaction.commit();
//        session.close();
//        return list;
    }
}
