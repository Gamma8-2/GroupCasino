package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.Card;
import com.github.zipcodewilmington.casino.GameInterface;

import java.util.ArrayList;

public class BlackJackGame {
    private int dealerHandValue;

    public int checkHandTotal(ArrayList<Card> playerCurrentHand){
        int addCardValue = 0;
        for (int i = 0; i < playerCurrentHand.size(); i++){
             Card card = playerCurrentHand.get(i);
            int total = card.getCardValue();
            addCardValue = addCardValue + total;
        }
        return addCardValue;
    }
    public void startNewRound(ArrayList<Card> playerCurrentHand){
        for(int i = 0; i< playerCurrentHand.size(); i++){
            playerCurrentHand.remove(i);
        }
    }

    public boolean checkForBlackJack(ArrayList<Card> playerCurrentHand){
        if (checkHandTotal(playerCurrentHand) == 21){
            return true;
        } return false;
    }
}
