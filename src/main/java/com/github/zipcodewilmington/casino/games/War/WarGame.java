package com.github.zipcodewilmington.casino.games.War;

import com.github.zipcodewilmington.casino.*;
import com.github.zipcodewilmington.casino.games.GoFish.CardDefaultEnum;
import com.github.zipcodewilmington.casino.games.GoFish.Hand;

public  class WarGame {


    public class War extends CardGame implements GameInterface {
        public java.util.ArrayList<WarPlayer> warPlayerList;

        public War(PlayerList playerList) {
        }

        @Override
        public void add(PlayerInterface player) {

        }

        @Override
        public void remove(PlayerInterface player) {

        }

        public void run() {

        }

        public Hand getPlayer1Hand() {
            Deck warPlayerDeck = new Deck(4, Card.Suits.HEARTS, CardDefaultEnum.FOUR);
            Hand player1Hand = new Hand();

            warPlayerDeck.deck();
            for (int i = 0; i < 26; i++) {
                Card card = warPlayerDeck.deck.pop();
                player1Hand.addCard();
            }
            return player1Hand;
        }

        public Hand getPlayer2Hand() {
            Deck warPlayerDeck = new Deck(4, Card.Suits.HEARTS,CardDefaultEnum.FOUR);
            Hand player2Hand = new Hand();

            warPlayerDeck.deck();
            for (int i = 26; i <= 52; i++) {
                Card card = warPlayerDeck.deck.pop();
                player2Hand.addCard();
            }
            return player2Hand;
        }


    }
}
