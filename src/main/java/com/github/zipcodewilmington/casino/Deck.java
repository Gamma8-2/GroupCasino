package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.GoFish.CardDefaultEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck extends Card{

   public Stack<Card> deck = new Stack<Card>();




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
