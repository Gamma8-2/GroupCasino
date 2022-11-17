package com.github.zipcodewilmington.casino;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CasinoAccountManagerTest {

    @Test
    void testGetAccount() {
        //Given
        String expectedName="name";
        String expectedPassword="name";
        CasinoAccountManager testAccount=new CasinoAccountManager();
        //When
        CasinoAccount objAccount=new CasinoAccount(expectedName,expectedPassword);
        String actualName=objAccount.get_name();
        String actualPwd=objAccount.get_password();
        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPassword,actualPwd);

    }

    @Test
    void testCreateAccount() {
        //Given
        String expectedName="hello";
        String expectedPassword="hello";
        CasinoAccountManager testAccount=new CasinoAccountManager();
        testAccount.createAccount(expectedName,expectedPassword);
        //When
        CasinoAccount objAccount=new CasinoAccount(expectedName,expectedPassword);
        String actualName=objAccount.get_name();
        String actualPwd=objAccount.get_password();
        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPassword,actualPwd);
    }

    @Test
    void testRegisterAccount() {
        //Given
        List<CasinoAccount> expectedLstAccount=new ArrayList<CasinoAccount>();
        CasinoAccountManager testAccount=new CasinoAccountManager();

        String name="name";
        String password="name";
        CasinoAccount objAccount=new CasinoAccount(name,password);
        testAccount.registerAccount(objAccount);

        String name1="hello";
        String password1="hello";
        CasinoAccount objAccount1=new CasinoAccount(name1,password1);
        testAccount.registerAccount(objAccount1);

        //When
        expectedLstAccount.add(objAccount);
        expectedLstAccount.add(objAccount1);
        List<CasinoAccount> actualLstAccount=new ArrayList<CasinoAccount>();
        actualLstAccount=testAccount.getLstAccount();

        //Then
        Assert.assertEquals(expectedLstAccount.size(),actualLstAccount.size());

    }
}