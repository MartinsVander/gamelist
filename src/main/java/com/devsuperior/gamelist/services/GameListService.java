package com.devsuperior.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.gamelist.dto.GameListDTO;
import com.devsuperior.gamelist.entities.GameList;
import com.devsuperior.gamelist.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findyAll(){
		
		List <GameList> result = gameListRepository.findAll();
		
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	

}
