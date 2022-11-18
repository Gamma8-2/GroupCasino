package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {
    @Test
    void TestGenerateMatrix(){
        //Given
        int expectedLength=3;
        //When
        int[][] actualSlotMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                actualSlotMatrix[i][j] = (int) (Math.random() * 6 + 1);
            }
        }
//        for (int[] row : actualSlotMatrix)
//            System.out.println(Arrays.toString(row));
        Assert.assertEquals(expectedLength,actualSlotMatrix.length);

        //Then
    }
    @Test
    void testRun() {
        SlotsGame game=new SlotsGame();
        //game.run();
    }

    @Test
    void add() {

    }

    @Test
    void remove() {
    }


}