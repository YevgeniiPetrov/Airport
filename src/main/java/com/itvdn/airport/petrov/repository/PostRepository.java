package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Optional<Post> getWithEmployees(int id);
    Optional<List<Post>> getAllWithEmployees();
}
