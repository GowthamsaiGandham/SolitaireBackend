package com.example.solitaire.service;


import com.example.solitaire.model.Game;
import com.example.solitaire.model.Pile;
import com.example.solitaire.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService implements GameRepository {
    public Game startGame(){
        return new Game();
    }
}
