package com.wsl.dslist.services;

import com.wsl.dslist.entities.Game;
import java.util.List;
import java.util.Optional;

public interface GameService {
    List<Game> findAll();
    Game findById(Long id);
}
