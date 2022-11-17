package com.github.zipcodewilmington.casino.games.GoFish;

import com.github.zipcodewilmington.casino.Card;

import java.util.ArrayList;

public class Hand {

    Card card;
    int value = 0;
    ArrayList<Card> hand = new ArrayList<>();

    public int getValue(){
    Integer value = 0;

        for (int i = 0; i < hand.size(); i++) {


            value = value + hand.get(i).getDefaultEnum().getCardDefaultEnum();

        }

   return value;
    }

    public int size(){
        return hand.size();
    }
    public void clearHand(){
         hand.clear();
    }
    public void addCard(){
         hand.add(card);
    }
    public String toString(){
        return ("Current Hand value is" + value);
    }

}
