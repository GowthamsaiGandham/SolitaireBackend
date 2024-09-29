package com.example.solitaire.model;

import java.util.List;

public class Pile {
    int id;
    List<Card> cardsPile;


    Pile(int id,List<Card> cardsPile){
        this.id = id;
        this.cardsPile = cardsPile;
    }

    public List<Card> getCardsPile() {
        return cardsPile;
    }

    public void setCardsPile(List<Card> cardsPile) {
        this.cardsPile = cardsPile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
