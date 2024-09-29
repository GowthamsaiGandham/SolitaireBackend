package com.example.solitaire.service;


import com.example.solitaire.model.Card;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class CardService {
    int[] typesOfValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    String[] cardImagesArray = {
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Cards-A-Club.svg/640px-Cards-A-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Cards-2-Club.svg/640px-Cards-2-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Cards-3-Club.svg/640px-Cards-3-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Cards-4-Club.svg/640px-Cards-4-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Cards-5-Club.svg/640px-Cards-5-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Cards-6-Club.svg/640px-Cards-6-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Cards-7-Club.svg/640px-Cards-7-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Cards-8-Club.svg/640px-Cards-8-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Cards-9-Club.svg/640px-Cards-9-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Cards-10-Club.svg/640px-Cards-10-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Cards-J-Club.svg/640px-Cards-J-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Cards-Q-Club.svg/640px-Cards-Q-Club.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Cards-K-Club.svg/640px-Cards-K-Club.svg.png"
    };

    List<Card> cardsList = new ArrayList<>();

    public List<Card> getCards(){
        int count = 1;
        for(int i = 1; i<= 8;i++){
            for(int j=0;j<=12;j++){
                cardsList.add(new Card(count,typesOfValues[j],100,true,cardImagesArray[j]));
                count = count+1;
            }
        }
        Random random  = new Random(5);
        Collections.shuffle(cardsList,random);
        return cardsList;
    }


    public Card getCardById(int cardId){
        Card existingCard = null;
        for(Card card : cardsList){
            if(card.getId() == cardId){
               existingCard = card;
            }
        }
        return existingCard;
    }

}
