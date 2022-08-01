package com.example.educationakhalyavinapi.repositories;

import com.example.educationakhalyavinapi.models.Model;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ModelRepository extends MongoRepository<Model,String> {
    Optional<Model> findById(String id);
}
