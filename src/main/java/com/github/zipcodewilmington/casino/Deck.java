package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.GoFish.CardDefaultEnum;

import java.util.ArrayList;
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
            for(int i = 1; i <= 13; i++){
                //System.out.println(suit);
                this.deck.add(new Card(i, suit));
                System.out.println("Card added: " + i + " of " + suit);
            }
        }
    }


    public Deck(Integer value, Suits suits,CardDefaultEnum cardDefaultEnum) {super(value, suits,cardDefaultEnum);}



    public void deck(){
       deck = new Stack<Card>();
        for (int i = 0; i < 13; i++) {
            CardDefaultEnum value = CardDefaultEnum.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(value, Suits.values()[j]);
                deck.push(card);
            }
        }
        Collections.shuffle(deck);
    }
}
