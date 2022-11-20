package com.github.zipcodewilmington.casino.games.wordguess;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class WordGuessPlayer implements PlayerInterface {
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private String _wordGuessPlayerName;
    private String _wordGuessPlayerPassword;
    private int _wordGuessPlayerBalance;

    public String get_wordGuessPlayerName() {
        return _wordGuessPlayerName;
    }

    public void set_wordGuessPlayerName(String _wordGuessPlayerName) {
        this._wordGuessPlayerName = _wordGuessPlayerName;
    }

    public String get_wordGuessPlayerPassword() {
        return _wordGuessPlayerPassword;
    }

    public void set_wordGuessPlayerPassword(String _wordGuessPlayerPassword) {
        this._wordGuessPlayerPassword = _wordGuessPlayerPassword;
    }

    public int get_wordGuessPlayerBalance() {
        return _wordGuessPlayerBalance;
    }

    public void set_wordGuessPlayerBalance(int _wordGuessPlayerBalance) {
        this._wordGuessPlayerBalance = _wordGuessPlayerBalance;
    }

    public WordGuessPlayer() {
        CasinoAccount objWordGuessPlayer=getArcadeAccount();
        this._wordGuessPlayerName =objWordGuessPlayer.get_name();
        this._wordGuessPlayerPassword =objWordGuessPlayer.get_password();
        this._wordGuessPlayerBalance=objWordGuessPlayer.get_balance();
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        String name=console.getStringInput("Hello WordGuess player! It Costs $1 to play Each attempt for WordGuessGame. Please enter your name ");
        String password=console.getStringInput("Please enter your password ");
        CasinoAccountManager objmgr=new CasinoAccountManager();
        CasinoAccount objWordPlayer = objmgr.getAccount(name,password);
        // CasinoAccount ObjCasinoAccount=new CasinoAccount(name,password);
        return objWordPlayer;
    }


    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
