package com.example.testSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testSpring.dto.GameMinDTO;
import com.example.testSpring.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
	}
}
