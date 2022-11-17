package com.github.zipcodewilmington.casino.games.GoFish;

import com.github.zipcodewilmington.casino.games.War.PlayerList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GoFishGameTest {

    @Test
   public void populateGoFishHandTest() {
       //Given
       GoFishGame goFish = new GoFishGame();
       //When
       goFish.populateGoFishHand();
       //Then
       int actualPlayer1Handsize= goFish.goFishHandPlayer1.hand.size();
       int actualPlayer2Handsize= goFish.goFishHandPlayer2.hand.size();
       Assert.assertEquals(7,actualPlayer1Handsize);
        Assert.assertEquals(7,actualPlayer2Handsize);


    }
    @Test
   public void populatePlayersAndListTest() {
       //Given
      GoFishGame goFish = new GoFishGame();

       //When
       goFish.populateGoFishHand();
       goFish.populatePlayersAndList(goFish.goFishHandPlayer1,goFish.goFishHandPlayer2);

       //Then
    //   int actualGoFishPlayerListSize=GoFishPlayer.PlayersList.size();

        //   Assert.assertEquals(2,actualGoFishPlayerListSize);
   }
}