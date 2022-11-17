package com.github.zipcodewilmington.casino;

import java.util.Collections;
import java.util.Stack;

public class Deck{

   public Stack<Card> deck = new Stack<Card>();

    public Deck() {
        this.deck = new Stack<Card>();
    }

    public void createDeck(){
        //ArrayList<Card> deck = new ArrayList<>();
        for(Card.Suits suit : Card.Suits.values()){
            for(CardDefaultEnum rank: CardDefaultEnum.values()){
                //System.out.println(suit);
                this.deck.add(new Card(rank, suit));
                System.out.println("Card added: " + rank + " of " + suit);
            }
        }
    }


    public Deck(Integer value, Card.Suits suits, CardDefaultEnum cardDefaultEnum) {
        super();
    }



    public void deck(){
       deck = new Stack<Card>();
        for (int i = 0; i < 13; i++) {
            CardDefaultEnum value = CardDefaultEnum.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(value, Card.Suits.values()[j]);
                deck.push(card);
            }
        }
        Collections.shuffle(deck);
    }

    public int getDeckSize() {
        return this.deck.size();
    }
}
