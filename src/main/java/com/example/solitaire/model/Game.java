package com.example.solitaire.model;

import com.example.solitaire.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Game {

    CardService cardService = new CardService();

    List<Pile> tableau = new ArrayList<>();
    List<List<Card>> CompletedDecks = new ArrayList<>();
    List<Card> remainingCards = new ArrayList<>();

    public  Game() {
        List<Card> cardsList = cardService.getCards();
        int count = 0;
        Pile newPile = null;
        int pileIndex = 0;
        for(int i = 0 ; i < 10;i++){
            List<Card> newPileOfCards = new ArrayList<>();
            for(int j=0;j < (i<4?6:5);j++){
                cardsList.get(count).setIndex(j);
                if(j == (i<4?5:4)){
                    cardsList.get(count).setHide(false);
                }
               newPileOfCards.add(cardsList.get(count));
                count = count+1;
            }
            newPile = new Pile(pileIndex,newPileOfCards);
            pileIndex = pileIndex+1;
            tableau.add(newPile);
        }
        for (int k = 54;k<104;k++){
            remainingCards.add(cardsList.get(k));
        }
    }

    public List<Pile> getTableau() {
        return tableau;
    }

    public void setTableau(List<Pile> tableau) {
        this.tableau = tableau;
    }

    public List<List<Card>> getCompletedDecks() {
        return CompletedDecks;
    }

    public void setCompletedDecks(List<List<Card>> completedDecks) {
        CompletedDecks = completedDecks;
    }

    public List<Card> getRemainingCards() {
        return remainingCards;
    }

    public void setRemainingCards(List<Card> remainingCards) {
        this.remainingCards = remainingCards;
    }
}
