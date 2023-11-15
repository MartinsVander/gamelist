package com.devsuperior.gamelist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.gamelist.dto.GameMinDTO;
import com.devsuperior.gamelist.entities.Game;
import com.devsuperior.gamelist.repositories.GameRepository;
// registrar como componente do sistema
// essa classe devolve GameMinDTO
@Service 
public class GameService {
	//injetando uma instancia do gameRepository dentro dessa classe 
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
	// Usa a stram API mapear Lista Game para GameMinDTO
		List<GameMinDTO> dtoList =result.stream().map(x-> new GameMinDTO(x)).toList();
	 	return dtoList;
	}

}
