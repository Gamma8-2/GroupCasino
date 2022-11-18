package com.github.zipcodewilmington.casino.games.roulette;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

public class RouletteGameTest {

    @Test
    public void playAgainTest(){
        RouletteGame test = new RouletteGame();
        String testChoice = "y";
        boolean actual = test.playAgain(testChoice);
        Assert.assertFalse(actual);
    }

    @Test
    public void playAgainTest2(){
        RouletteGame test = new RouletteGame();
        String testChoice = "n";
        boolean actual = test.playAgain(testChoice);
        Assert.assertTrue(actual);
    }

    @Test
    public void spinWheelTest(){ //TODO RUN TEST MULTIPLE TIMES DUE TO
                                 //TODO FOR RANDOM NUMBER GENERATION
        RouletteGame test = new RouletteGame();
        int menuChoice = 1;
        int balance = 100;
        int playerBet = 10;
        int playerNumberChoice = 0;
        int actual = test.spinWheel(menuChoice, balance, playerBet, playerNumberChoice);

        int expected = 120;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spinWheelTest2(){ //TODO RUN TEST MULTIPLE TIMES DUE TO
                                  //TODO FOR RANDOM NUMBER GENERATION
        RouletteGame test = new RouletteGame();
        int menuChoice = 2;
        int balance = 100;
        int playerBet = 10;
        int playerNumberChoice = 0;
        int actual = test.spinWheel(menuChoice, balance, playerBet, playerNumberChoice);

        int expected = 120;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spinWheelTest3(){ //TODO RUN TEST MULTIPLE TIMES DUE TO
                                  //TODO FOR RANDOM NUMBER GENERATION
        RouletteGame test = new RouletteGame();
        int menuChoice = 3;
        int balance = 100;
        int playerBet = 10;
        int playerNumberChoice = 10;
        int actual = test.spinWheel(menuChoice, balance, playerBet, playerNumberChoice);

        int expected = 200;

        Assert.assertEquals(expected, actual);
    }
}
