package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.casino.games.GoFish.CardDefaultEnum;

public class Card {

   //added for cardDefaultEnum
    private CardDefaultEnum cardDefaultEnum;

    public Card(CardDefaultEnum value, Suits value1) {
        this.cardDefaultEnum =value;
    }

    public enum Suits {HEARTS, CLUBS, SPADES, DIAMONDS};

    Integer cardValue;
    Suits suit;

    public Card (Integer value, Suits suit,CardDefaultEnum cardDefaultEnum){ //added for Hand class
        this.cardValue = value;
        this.suit = suit;
        this.cardDefaultEnum = cardDefaultEnum;
    }

    public Suits getSuit(){
        return suit;
    }

    public Integer getCardValue(){
        return cardValue;
    }

    //create the getter and setter for Hand class.

    public CardDefaultEnum getDefaultEnum() {
        return cardDefaultEnum;
    }
    public void setCardDefaultEnum(CardDefaultEnum cardDefaultEnum) {
        this.cardDefaultEnum = cardDefaultEnum;
    }
}
