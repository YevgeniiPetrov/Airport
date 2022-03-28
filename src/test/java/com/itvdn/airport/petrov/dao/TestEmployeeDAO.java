package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Employee;
import com.itvdn.airport.petrov.entity.Post;
import com.itvdn.airport.petrov.entity.TestPost;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestEmployeeDAO {
    private static final EmployeeDAO DAO = new DAOFactoryImpl().getEmployeeDAO();
    private static final Class<Employee> CLASS = Employee.class;

    private static Employee getEmployee() {
        return Employee
                .builder()
                .firstName("Test")
                .lastName("Test")
                .birthDate(LocalDate.of(2000, 10, 5))
                .post(TestPost.getPost())
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getEmployee(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getEmployee(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getEmployee(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getEmployee(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
