package com.github.zipcodewilmington.casino.games.YouAreOut;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import org.junit.Test;

public class YouAreOutPlayerTest {
    @Test
    public void getArcadeAccountTest(){
        //given: an arcade account
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        CasinoAccount newAccount = new CasinoAccount("Troy", "pass");
        YouAreOutPlayer player = new YouAreOutPlayer();
        //when:
        player.getArcadeAccount();
        //then:
    }
}
