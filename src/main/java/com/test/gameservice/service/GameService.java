package com.test.gameservice.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.gameservice.model.Game;
import com.test.gameservice.repository.GameRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GameService {

	private final GameRepository gameRepository;
	
	public List<Game> getGames() {
		return gameRepository.findAll();
	}

	public Game createGame(Game gameToCreate) {
		return gameRepository.save(gameToCreate);
	}

	public Game getGameById(String id) {
		return gameRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Game not found"));
	}

	public void deleteGame(String id) {
		gameRepository.deleteById(id);
	}

	public void updateGame(String id, Game replacement) {
		Game currentGame = getGameById(id);
		
		if (currentGame.equals(null)) return;
		
		currentGame.setName(replacement.getName());
		currentGame.setPrice(replacement.getPrice());
		currentGame.setReleaseDate(new Date());
		
		gameRepository.save(currentGame);
	}
}
