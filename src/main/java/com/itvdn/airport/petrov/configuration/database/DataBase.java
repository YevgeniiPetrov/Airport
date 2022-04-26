package com.itvdn.airport.petrov.configuration.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class DataBase<T> {
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

    public T get(int id, Class<T> type, String... fields) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        T object = null;
        Query query;
        StringBuilder queryStr = new StringBuilder()
                .append("select obj from ")
                .append(type.getSimpleName())
                .append(" obj ");
        if (fields.length == 0) {
            queryStr.append("where obj.id = :id");
            query = session.createQuery(queryStr.toString());
            query.setParameter("id", id);
            object = (T) query.getSingleResult();
        } else {
            for (String field : fields) {
                StringBuilder temQuery = new StringBuilder(queryStr);
                temQuery.append("left join fetch obj.")
                        .append(field)
                        .append(" ")
                        .append(field)
                        .append(" ")
                        .append("where obj.id = :id");
                query = session.createQuery(temQuery.toString());
                query.setParameter("id", id);
                object = (T) query.getSingleResult();
            }
        }
        transaction.commit();
        session.close();
        return object;
    }

    public T update(T object) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
        return object;
    }

    public void delete(T object) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
    }

    public List<T> getAll(Class<T> type, String... fields) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        StringBuilder queryStr = new StringBuilder()
                .append("select obj from ")
                .append(type.getSimpleName())
                .append(" obj ");
        Query query = session.createQuery(queryStr.toString());
        List objects = query.getResultList();
        for (String field : fields) {
            StringBuilder temQuery = new StringBuilder(queryStr);
            temQuery.append("left join fetch obj.")
                    .append(field)
                    .append(" ")
                    .append(field)
                    .append(" ")
                    .append("where obj in :objects");
            query = session.createQuery(temQuery.toString());
            query.setParameter("objects", objects);
            objects = query.getResultList();
        }
        transaction.commit();
        session.close();
        return objects;
    }
}
