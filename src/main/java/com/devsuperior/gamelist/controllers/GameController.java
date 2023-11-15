package com.devsuperior.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.gamelist.dto.GameDTO;
import com.devsuperior.gamelist.dto.GameMinDTO;
import com.devsuperior.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameController {
	@Autowired
	private GameService gameservice;
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		List<GameMinDTO> result = gameservice.findAll();
		return result;
						
	}
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
	
		GameDTO result = gameservice.findById(id);
		return result;
		
	}
	

}
