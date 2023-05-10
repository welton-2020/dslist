package com.wsl.dslist.controllers;

import com.wsl.dslist.entities.Game;
import com.wsl.dslist.services.impl.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    GameServiceImpl gameService;

    @GetMapping
    public List<Game> findAll(){
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id){
        return ResponseEntity.ok(gameService.findById(id));
    }

}
