package com.github.zipcodewilmington.casino.games.GoFish;

import com.github.zipcodewilmington.casino.*;

import java.util.ArrayList;
import java.util.List;

public class GoFishGame extends CardGame implements GameInterface {

    public ArrayList<GoFishPlayer> goFishPlayers;
    public Deck myDeck;
    public Hand goFishHandPlayer1;
    public Hand goFishHandPlayer2;
    public GoFishPlayer gfPlayer1;
    public GoFishPlayer gfPlayer2;

    public GoFishGame() {
        myDeck = new Deck(5, Card.Suits.HEARTS,CardDefaultEnum.FIVE);

    }


    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }
    public void populateGoFishHand(){
       //pop 7 cards and add to player 1 hand
      for(int i =0;i<7;i++){
            Card card = myDeck.deck.pop();
           goFishHandPlayer1.addCard();
            //System.out.println("Player1 hand : " + );
        }
        //pop 7 cards and add to player 2 hand
        for(int i =0;i<7;i++){
            Card card = myDeck.deck.pop();
            goFishHandPlayer2.addCard();
           // System.out.println("Player2 hand : " + card);
        }
   }
    public void populatePlayersAndList(Hand player1, Hand player2){
       //populate player1
        gfPlayer1.setName("GoFishPlayer1");
        gfPlayer1.setPlayerHand(player1);
       // gfPlayer1.setScore(0);
        //populate player2
        gfPlayer2.setName("GoFishPlayer2");
        gfPlayer2.setPlayerHand(player2);
        //gfPlayer2.setScore(0);
        //initialize and populate list
       List<GoFishPlayer> goFishPlayerList= new ArrayList<GoFishPlayer>();
        goFishPlayerList.add(gfPlayer1);
        goFishPlayerList.add(gfPlayer2);
   }
    public void findDuplicateCardsForEachPlayer(GoFishPlayer player) {
        //Finds duplicate scores and increments the score if duplicates are found
        ArrayList<Card> cardArrayList = player.getPlayerHand().hand;

        for (int i = 0; i < cardArrayList.size(); i++) {
            for (int j = i + 1; j < cardArrayList.size(); j++) {
                CardDefaultEnum enumi = cardArrayList.get(i).getDefaultEnum();
                CardDefaultEnum enumj = cardArrayList.get(j).getDefaultEnum();
                int cardValueenumi = (int) enumi.getCardDefaultEnum();
                int cardValueenumj = (int) enumj.getCardDefaultEnum();
                // System.out.println("CardDefaultEnumi: "+ enumi);
                // System.out.println("CardDefaultEnumj: "+ enumj);

                System.out.println("IntCardDefaultEnumi: " + cardValueenumi);
                System.out.println("IntCardDefaultEnumj: " + cardValueenumj);

                if (enumi == enumj) {
                    cardArrayList.remove(i);
                    cardArrayList.remove(j);
                    // player.get_balance();

                }
                // System.out.println("Player score : " + player.getScore());
                System.out.println("Size of the array : " + cardArrayList.size());

            }
        }
    }


}
