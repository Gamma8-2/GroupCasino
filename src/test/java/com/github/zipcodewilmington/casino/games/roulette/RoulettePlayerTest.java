package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

public class RoulettePlayerTest {
    @Test
    public void testGetArcadeAccount() {
        String expectedName = "name";
        String expectedPassword = "password";
        Integer expectedBalance = 100;
        CasinoAccount test = new CasinoAccount(expectedName, expectedPassword);
        //When
        String actualName = test.get_name();
        String actualPassword = test.get_password();
        Integer actualBalance = test.get_balance();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPassword, actualPassword);
        Assert.assertEquals(expectedBalance, actualBalance);
    }

//    @Test
//    public void testGetRoulettePlayerBalance(){
//        RoulettePlayer test = new RoulettePlayer();
//
//        int expected = 100;
//        int actual = test.get_roulettePlayerBalance();
//
//        Assert.assertEquals(expected, actual);
//
//    }
}
