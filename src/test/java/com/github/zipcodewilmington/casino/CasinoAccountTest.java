package com.github.zipcodewilmington.casino;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasinoAccountTest {

    //Casino Constructor Test
    @Test
    public void testConstructorCasinoAccount(){
        //Given
        String expectedName="name";
        String expectedPassword="passowrd";
        CasinoAccount account=new CasinoAccount(expectedName,expectedPassword);
        //When
        String actualName=account.get_name();
        String actualPassword=account.get_password();
        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPassword,actualPassword);
    }
    @Test
    public void testConstructorCasinoAccountWithBalance(){
        //Given
        String expectedName="name";
        String expectedPassword="passowrd";
        Integer expectedbalance=50;
        CasinoAccount account=new CasinoAccount(expectedName,expectedPassword,expectedbalance);
        //When
        String actualName=account.get_name();
        String actualPassword=account.get_password();
        Integer actualBalanace=account.get_balance();
        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPassword,actualPassword);
        Assert.assertEquals(expectedbalance,actualBalanace);
    }

}