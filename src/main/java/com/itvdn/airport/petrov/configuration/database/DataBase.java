package com.itvdn.airport.petrov.configuration.database;

import com.itvdn.airport.petrov.entity.Essence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
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
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public Optional<T> get(int id, Class<T> type) {
        T object = null;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            StringBuilder queryStr = new StringBuilder()
                    .append("select obj from ")
                    .append(type.getSimpleName())
                    .append(" obj ")
                    .append("where obj.id = :id");
            Query query = session.createQuery(queryStr.toString());
            query.setParameter("id", id);
            object = (T) query.getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(object);
    }

    public T update(T object) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public Boolean delete(T object) {
        object.setRemoved(true);
        update(object);
        return object.getRemoved();
    }

    public List<T> getAll(Class<T> type) {
        List<T> objects;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            StringBuilder queryStr = new StringBuilder()
                    .append("select obj from ")
                    .append(type.getSimpleName())
                    .append(" obj ");
            Query query = session.createQuery(queryStr.toString());
            objects = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            objects = new ArrayList<>();
        }
        return objects;
    }
}
