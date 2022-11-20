package com.github.zipcodewilmington.casino.games.wordguess;

import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordGuessGameTest {

    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void run() {
    }

    @Test
    void wordEngineTest1() {

        WordGuessGame gg = new WordGuessGame();

        boolean actual = gg.wordEngine("owl","owl",100,"Latha");
        boolean expected = true;
        Assert.assertEquals(actual, expected);


    }
    @Test
    void wordEngineTest2() {

        WordGuessGame gg = new WordGuessGame();

        boolean actual = gg.wordEngine("old","owl",100,"Latha");
        boolean expected = false;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void randNumTest() {

        int expected = 3;
        int actual = (int) (3 * Math.random());

        Assert.assertTrue(actual >=0 && actual <= 3);
    }
}