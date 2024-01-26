package com.test.gameservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.gameservice.model.Game;

public interface GameRepository extends MongoRepository<Game, String>{
}