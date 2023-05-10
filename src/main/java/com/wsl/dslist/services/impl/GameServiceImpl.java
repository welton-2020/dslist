package com.wsl.dslist.services.impl;

import com.wsl.dslist.entities.Game;
import com.wsl.dslist.repositories.GameRepository;
import com.wsl.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository gameRepository;
    public List<Game> findAll(){
        return gameRepository.findAll();
    }

    @Override
    public Game findById(Long id) {
        Optional<Game> game = gameRepository.findById(id);
        return game.get();
    }

}
