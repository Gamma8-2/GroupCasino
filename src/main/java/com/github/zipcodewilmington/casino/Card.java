package com.github.zipcodewilmington.casino;

public class Card {
    public enum Suits {HEARTS, CLUBS, SPADES, DIAMONDS}

    Integer cardValue;
    Suits suit;

    public Card (Integer value, Suits suit){
        this.cardValue = value;
        this.suit = suit;
    }

    public Suits getCardSuit(){
        return suit;
    }

    public Integer getCardValue(){
        return cardValue;
    }
}
