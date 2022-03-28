package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPostDAO {
    private static final PostDAO DAO = new DAOFactoryImpl().getPostDAO();
    private static final Class<Post> CLASS = Post.class;

    private static final Post getPost() {
        return Post
                .builder()
                .title("Test")
                .salary(10000.0)
                .build();
    }

    @Test
    void testAdd() {
        Assertions.assertTrue(TestDAO.testAdd(DAO, getPost(), CLASS));
    }

    @Test
    void testGet() {
        Assertions.assertTrue(TestDAO.testGet(DAO, getPost(), CLASS));
    }

    @Test
    void testUpdate() {
        Assertions.assertTrue(TestDAO.testUpdate(DAO, getPost(), CLASS));
    }

    @Test
    void testDelete() {
        Assertions.assertTrue(TestDAO.testDelete(DAO, getPost(), CLASS));
    }

    @Test
    void testGetAll() {
        Assertions.assertTrue(TestDAO.testGetAll(DAO));
    }
}
