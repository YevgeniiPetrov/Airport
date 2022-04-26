package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Post;

import java.util.List;

public interface PostRepository {
    Post getWithEmployees(int id);
    List<Post> getAllWithEmployees();
}
