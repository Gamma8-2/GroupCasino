package com.github.zipcodewilmington.casino;

public class Card {

   //added for cardDefaultEnum
    private CardDefaultEnum cardDefaultEnum;

    Integer cardValue;
    Suits suit;

    public Card(CardDefaultEnum value, Suits value1) {
        this.cardDefaultEnum = value;
        this.suit = value1;
    }

    public enum Suits {HEARTS, CLUBS, SPADES, DIAMONDS};




    public Card (CardDefaultEnum cardDefaultEnum,  Suits suit, Integer value){ //added for Hand class
        this.cardValue = value;
        this.suit = suit;
        this.cardDefaultEnum = cardDefaultEnum;
    }

    public Suits getCardSuit(){
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
