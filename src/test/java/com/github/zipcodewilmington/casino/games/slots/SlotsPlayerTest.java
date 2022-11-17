package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotsPlayerTest {

    @Test
    void testGetArcadeAccount() {
        String expectedName="name";
        String expectedPassword="passowrd";
        Integer expectedbalance=100;
        CasinoAccount account=new CasinoAccount(expectedName,expectedPassword);
        //When
        String actualName=account.get_name();
        String actualPassword=account.get_password();
        Integer actualBalanace=account.get_balance();
        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPassword,actualPassword);
        Assert.assertEquals(expectedbalance,actualBalanace);

    }

    @Test
    void play() {
    }

    @Test
    void run() {
    }
}