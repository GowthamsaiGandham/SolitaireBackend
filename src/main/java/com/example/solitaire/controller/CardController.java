package com.example.solitaire.controller;

import com.example.solitaire.model.Card;

import com.example.solitaire.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping("/cards")
    public ArrayList<Card> getCards(){
        List<Card> cardsList = cardService.getCards();
        return new ArrayList<>(cardsList);
    }

    @GetMapping("/cards/{cardId}")
    public Card getCardById(@PathVariable("cardId") int cardId){
         return cardService.getCardById(cardId);
    }
}
