package com.devsuperior.gamelist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.gamelist.dto.GameDTO;
import com.devsuperior.gamelist.dto.GameMinDTO;
import com.devsuperior.gamelist.entities.Game;
import com.devsuperior.gamelist.repositories.GameRepository;

import jakarta.transaction.Transactional;
// registrar como componente do sistema
// essa classe devolve GameMinDTO
@Service 
public class GameService {
	//injetando uma instancia do gameRepository dentro dessa classe 
	@Autowired
	private GameRepository gameRepository;
	//retorna a lista de todos os games
	// verificar @Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
	// Usa a stram API mapear Lista Game para GameMinDTO
		List<GameMinDTO> dtoList =result.stream().map(x-> new GameMinDTO(x)).toList();
	 	return dtoList;
	}
	
	// verificar @Transactional(readOnly = true)
	public GameDTO findById(Long id){
		
	Game result= gameRepository.findById(id).get();
	//convertendo Game para GameDTO
	return  new GameDTO(result);
	 
	
	}
}
