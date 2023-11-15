package com.devsuperior.gamelist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	List<Game> findAll();

}
