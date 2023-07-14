package com.example.testSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
