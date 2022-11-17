package com.github.zipcodewilmington.casino.games.GoFish;

import com.github.zipcodewilmington.casino.CasinoAccount;

public class GoFishPlayer extends CasinoAccount {
    public String name;
    public Hand playerHand;

    public GoFishPlayer(String _name, String _password, int _balance) {
        super(_name, _password, _balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }
}
