package com.itvdn.airport.petrov.configuration.database;

import com.itvdn.airport.petrov.entity.Essence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.context.annotation.Configuration
public class DataBase<T extends Essence> {
    private static SessionFactory sessionFactory;

    public DataBase() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public T add(T object) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
        return object;
    }

    public Optional<T> get(int id, Class<T> type) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        T object = null;
        try {
            StringBuilder queryStr = new StringBuilder()
                    .append("select obj from ")
                    .append(type.getSimpleName())
                    .append(" obj ")
                    .append("where obj.id = :id");
            Query query = session.createQuery(queryStr.toString());
            query.setParameter("id", id);
            object = (T) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {}
        session.close();
        return Optional.ofNullable(object);
    }

    public T update(T object) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
        return object;
    }

    public Boolean delete(T object) {
        object.setRemoved(true);
        update(object);
        return object.getRemoved();
    }

    public List<T> getAll(Class<T> type) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<T> objects;
        try {
            StringBuilder queryStr = new StringBuilder()
                    .append("select obj from ")
                    .append(type.getSimpleName())
                    .append(" obj ");
            Query query = session.createQuery(queryStr.toString());
            objects = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            objects = new ArrayList<>();
        }
        session.close();
        return objects;
    }
}
