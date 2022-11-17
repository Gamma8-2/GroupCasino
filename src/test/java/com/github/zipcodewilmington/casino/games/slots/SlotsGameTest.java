package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {

    @Test
    void add() {
        CasinoAccount player1=new CasinoAccount("name","password");

    }

    @Test
    void remove() {
    }


    @Test
    void testRun() {
        SlotsGame game=new SlotsGame();
        game.run();
    }
}