package com.github.zipcodewilmington.casino;

import java.util.ArrayList;
import java.util.Stack;

public class Deck{

    Stack<Card> deck;

    public Deck() {
        this.deck = new Stack<Card>();
    }

    public void createDeck(){
        //ArrayList<Card> deck = new ArrayList<>();
        for(Card.Suits suit : Card.Suits.values()){
            for(int i = 1; i <= 13; i++){
                //System.out.println(suit);
                this.deck.add(new Card(i, suit));
                System.out.println("Card added: " + i + " of " + suit);
            }
        }
    }

    public int getDeckSize(){
        return this.deck.size();
    }
}
