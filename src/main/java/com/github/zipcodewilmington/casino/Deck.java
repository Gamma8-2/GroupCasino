package com.github.zipcodewilmington.casino;

import java.util.ArrayList;
import java.util.Stack;

public class Deck extends Card{

    Stack<Card> deck = new Stack<Card>();

    public Deck(Integer value, Suits suits) {
        super(value, suits);
    }



}
