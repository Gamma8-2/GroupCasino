package com.github.zipcodewilmington.casino.games.roulette;

import org.junit.Assert;
import org.junit.Test;

public class RouletteGameTest {
    @Test
    public void RGTest(){}

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
}
