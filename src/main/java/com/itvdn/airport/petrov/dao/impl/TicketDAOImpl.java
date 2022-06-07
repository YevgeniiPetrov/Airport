package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TicketDAO;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Ticket;
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
public class TicketDAOImpl implements TicketDAO {
    private DataBase<Ticket> dataBase;

    @Override
    public Optional<Ticket> get(int id) {
        return dataBase.get(id, Ticket.class);
    }

    @Override
    public List<Ticket> getAll() {
        return dataBase.getAll(Ticket.class);
    }

    @Override
    public List<Ticket> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        Session session = dataBase.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StringBuilder queryStr = new StringBuilder()
                .append("select t ")
                .append("from Ticket t ")
                .append("where t.creationDate between :dateFrom and :dateTo");
        Query query = session.createQuery(queryStr.toString());
        query.setParameter("dateFrom", dateFrom);
        query.setParameter("dateTo", dateTo);
        List<Ticket> list = query.getResultList();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public List<Ticket> getAllByFlight(Flight flight) {
        return getAll().stream().filter(t -> t.getFlight().getId() == flight.getId()).toList();
    }
}
