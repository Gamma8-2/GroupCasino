package com.github.zipcodewilmington.casino.games.blackjack;

import com.github.zipcodewilmington.casino.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.github.zipcodewilmington.casino.CardDefaultEnum.*;
import static org.junit.Assert.*;

public class BlackJackGameTest {
    BlackJackGame game = new BlackJackGame();

    //-dealerHandValue: int
    //-playersAtTable: ArcadeAccount[]
    //-blackjackDealer: ArcadeAccount

    //+checkHandTotal()
    //+startNewRound()
    //+checkforBlackjack()

//    @Test
//    public void BlackJackConstructorTest(){
//        //given
//        CasinoAccountManager manager = new CasinoAccountManager();
//        ArrayList<CasinoAccount> playersAtTable = new ArrayList<>();
//        playersAtTable.add(manager.createAccount("Troy", "password"));
//        playersAtTable.add(manager.createAccount("Dealer", "pass"));
//
//        String actual = "";
//        for(int i = 0; i < playersAtTable.size(); i++){
//            System.out.println(playersAtTable.get(i).get_name());
//            actual = actual + playersAtTable.get(i).get_name() + " ";
//        }
//        String expected = "Troy";
//        System.out.println(actual);
//
//        //when
//        BlackJackGame testGame = new BlackJackGame();
//        //then
//
//    }

    @Test
    public void checkHandTotalTest(){
        //this method returns (probably) the sum of two values from an array of enums
        //given
        Card card1 = new Card(JACK, Card.Suits.DIAMONDS, 11);
        Card card2 = new Card (FOUR, Card.Suits.CLUBS, 4);
        //when
        ArrayList<Card> currentHand = new ArrayList<>();
        currentHand.add(card1);
        currentHand.add(card2);
        //then
        int actual = game.checkHandTotal(currentHand);
        int expected = 15;
        assertEquals(expected, actual);

//        //when
//        Card bottom = currentHand.get(0);
//        Card top = currentHand.get(1);
//        int expected = 15;
//        int actual = bottom.getCardValue() + top.getCardValue();
//        //then
//        assertEquals(expected,actual);
    }

    @Test
    public void startNewRoundTest(){
        //given
        Card card1 = new Card(JACK, Card.Suits.DIAMONDS, 11);
        Card card2 = new Card (FOUR, Card.Suits.CLUBS, 4);
        //when
        ArrayList<Card> newArray = new ArrayList<>();
        newArray.add(card1);
        newArray.add(card2);
        //when
        int expected = 0;
        game.startNewRound(newArray);
        //then
        System.out.println(newArray);
//        assertEquals(expected, actual);
    }

    @Test
    public void checkForBlackJackTest(){
        //given
        Card card1 = new Card(JACK, Card.Suits.DIAMONDS, 11);
        Card card2 = new Card (FOUR, Card.Suits.CLUBS, 4);
        //when
        ArrayList<Card> newArray = new ArrayList<>();
        newArray.add(card1);
        newArray.add(card2);
        //then
        int valueOfCards = game.checkHandTotal(newArray);
        boolean actual = game.checkForBlackJack(newArray);
        assertFalse(actual);
    }
    @Test
    public void checkForBlackJackTest1(){
        //given

        Card card1 = new Card(TEN, Card.Suits.SPADES, 10);
        Card card2 = new Card (JACK, Card.Suits.HEARTS, 11);
        //when
        ArrayList<Card> newArray = new ArrayList<>();
        newArray.add(card1);
        newArray.add(card2);
        //then
        int valueOfCards = game.checkHandTotal(newArray);
        boolean actual = game.checkForBlackJack(newArray);
        assertTrue(actual);
    }
//    @Test
//    public void checkForWinnerTest(){
//        //given
//        BlackJackPlayer player1 = new BlackJackPlayer();
//        player1.getHand();
//        //when
//
//        //then
//    }
}
