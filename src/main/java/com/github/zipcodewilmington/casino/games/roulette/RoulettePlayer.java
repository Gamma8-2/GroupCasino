package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class RoulettePlayer implements PlayerInterface {

    private String _roulettePlayerName;

    private String _roulettePlayerPassword;

    private int _roulettePlayerBalance;

    public String get_roulettePlayerName(){
        return _roulettePlayerName;
    }

    public void set_roulettePlayerName(String roulettePlayerName){
        this._roulettePlayerName = roulettePlayerName;
    }

    public String get_roulettePlayerPassword(){
        return _roulettePlayerPassword;
    }

    public void set_roulettePlayerPassword(String roulettePlayerPassword){
        this._roulettePlayerPassword = roulettePlayerPassword;
    }

    public int get_roulettePlayerBalance(){
        return _roulettePlayerBalance;
    }

    public void set_roulettePlayerBalance(int _roulettePlayerBalance){
        this._roulettePlayerBalance = _roulettePlayerBalance;
    }
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);

    public RoulettePlayer(){
        CasinoAccount objRoulettePlayer = getArcadeAccount();
        this._roulettePlayerName = objRoulettePlayer.get_name();
        this._roulettePlayerPassword = objRoulettePlayer.get_password();
        this._roulettePlayerBalance = objRoulettePlayer.get_balance();
    }

    @Override
    public CasinoAccount getArcadeAccount() {
        String name=console.getStringInput("Welcome to the Roulette table! Minimum $1 to bet. Please enter your name: ");
        String password=console.getStringInput("Please enter your password ");
        CasinoAccountManager objmgr=new CasinoAccountManager();
        CasinoAccount objRoulettePlayer = objmgr.getAccount(name, password);
        //CasinoAccount ObjCasinoAccount=new CasinoAccount(name,password);
        return objRoulettePlayer;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
