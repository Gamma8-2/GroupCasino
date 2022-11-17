package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.*;

import java.util.ArrayList;

public class BlackJackGame {
    private int dealerHandValue;
    public ArrayList<CasinoAccount> playersAtTable = new ArrayList<>();

    //making a Dealer that will be present in each game
    CasinoAccount Dealer = new CasinoAccount("Dealer", "house", 100);
//    String Dealer = houseAccount.get_name();
//extends CardGame implements GamblingGame

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

    //a method that compares your hand to other players hands
//    @Override
//    public void checkForWinner(){
//        Object playerHand;
//        for (int i = 0; i < playersAtTable.size(); i++){
//            playerHand = playersAtTable.get(i);
//
//        }
//    }
//
//    @Override
//    public void add(PlayerInterface player) {
//        playersAtTable.add(Dealer);
//
//
//    }
//
//    @Override
//    public void remove(PlayerInterface player) {
//
//    }
//
//    @Override
//    public void run() {
//
//    }
//
//    @Override
//    public void placeBet() {
//
//    }
//
//    @Override
//    public void receivePayout() {
//
//    }
}
