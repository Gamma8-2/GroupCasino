package com.github.zipcodewilmington.casino.games.YouAreOut;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class YouAreOutPlayer implements PlayerInterface {
    private String youAreOutPlayerName;
    private String youAreOutPlayerPassword;

    public IOConsole getConsole() {
        return console;
    }

    private int youAreOutPlayerBalance;
    private final IOConsole console = new IOConsole(AnsiColor.RED);

    public YouAreOutPlayer(){
        CasinoAccount objYouAreOutPlayer=getArcadeAccount();
        this.youAreOutPlayerName=objYouAreOutPlayer.get_name();
        this.youAreOutPlayerPassword=objYouAreOutPlayer.get_password();
    }

    public String getYouAreOutPlayerName() {
        return youAreOutPlayerName;
    }

    public void setYouAreOutPlayerName(String youAreOutPlayerName) {
        this.youAreOutPlayerName = youAreOutPlayerName;
    }

    public String getYouAreOutPlayerPassword() {
        return youAreOutPlayerPassword;
    }

    public void setYouAreOutPlayerPassword(String youAreOutPlayerPassword) {
        this.youAreOutPlayerPassword = youAreOutPlayerPassword;
    }

    public int getYouAreOutPlayerBalance() {
        return youAreOutPlayerBalance;
    }

    public void setYouAreOutPlayerBalance(int youAreOutPlayerBalance) {
        this.youAreOutPlayerBalance = youAreOutPlayerBalance;
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        String name = console.getStringInput("Welcome to You Are Out! Please enter your name.");
        String password = console.getStringInput("Please enter your password");
        CasinoAccountManager objMgr = new CasinoAccountManager();
        CasinoAccount objYouAreOutPlayer = objMgr.getAccount(name, password);
        return objYouAreOutPlayer;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
