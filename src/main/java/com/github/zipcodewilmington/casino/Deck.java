package com.github.zipcodewilmington.casino;

import java.util.ArrayList;
import java.util.Stack;

public class Deck{

    ArrayList<Card> deck;

    public Deck() {

    }

    public void createDeck(){
        //ArrayList<Card> deck = new ArrayList<>();
        for(Card.Suits suit : Card.Suits.values()){
            for(int i = 1; i <= 13; i++){
                //System.out.println(suit);
                this.deck.add(new Card(i, suit));
                //System.out.println("Card added: " + i + " of " + suit);
            }
        }
    }



}
