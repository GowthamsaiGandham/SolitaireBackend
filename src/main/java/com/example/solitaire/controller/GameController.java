package com.example.solitaire.controller;


import com.example.solitaire.model.Card;
import com.example.solitaire.model.Game;
import com.example.solitaire.model.Pile;
import com.example.solitaire.service.CardService;
import com.example.solitaire.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GameController {
    @Autowired
    GameService gameService;

    @Autowired
    CardService cardService;

    @MessageMapping("/getInitialGameState")
    @SendTo("/topic/gameState")
    public Game startGame(){
        return gameService.startGame();
    }

    @MessageMapping("/getCards")
    @SendTo("/topic/gameState")
    public List<Card>  getCards(){
        return cardService.getCards();
    }

}
