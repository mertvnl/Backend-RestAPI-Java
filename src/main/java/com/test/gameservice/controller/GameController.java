package com.test.gameservice.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.gameservice.model.Game;
import com.test.gameservice.service.GameService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/games")
@AllArgsConstructor
public class GameController {
	
	private final GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<Game>> getGames(){	
		return new ResponseEntity<>(gameService.getGames(), OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Game> getGame(@PathVariable String id){
		return new ResponseEntity<>(getGameById(id), OK);
	}
	
	@PostMapping
	public ResponseEntity<Game> createGame(@RequestBody Game gameToCreate){
		return new ResponseEntity<>(gameService.createGame(gameToCreate), CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateGame(@PathVariable String id, @RequestBody Game replacement){

		gameService.updateGame(id, replacement);
		
		return new ResponseEntity<>(OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteGame(@PathVariable String id){
		gameService.deleteGame(id);
		return new ResponseEntity<>(OK);
	}
	
	private Game getGameById(String id) {
		return gameService.getGameById(id);
	}
}
