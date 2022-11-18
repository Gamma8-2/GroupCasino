package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {
//    CasinoAccount objSlotPlayer;
//CasinoAccount objSlotPlayer;
    private String _slotPlayerName;
    private String _slotPlayerPassword;

    public String get_slotPlayerName() {
        return _slotPlayerName;
    }

    public void set_slotPlayerName(String _slotPlayerName) {
        this._slotPlayerName = _slotPlayerName;
    }

    public String get_slotPlayerPassword() {
        return _slotPlayerPassword;
    }

    public void set_slotPlayerPassword(String _slotPlayerPassword) {
        this._slotPlayerPassword = _slotPlayerPassword;
    }

    public int get_slotPlayerBalance() {
        return _slotPlayerBalance;
    }

    public void set_slotPlayerBalance(int _slotPlayerBalance) {
        this._slotPlayerBalance = _slotPlayerBalance;
    }

    private int _slotPlayerBalance;

    private final IOConsole console = new IOConsole(AnsiColor.GREEN);

    public SlotsPlayer() {
        CasinoAccount objSlotPlayer=getArcadeAccount();
       this._slotPlayerName=objSlotPlayer.get_name();
        this._slotPlayerPassword=objSlotPlayer.get_password();
        this._slotPlayerBalance=objSlotPlayer.get_balance();
    }


    @Override
    public CasinoAccount getArcadeAccount() {
        String name=console.getStringInput("Helloo Slot player!It cost 1$ for each round. Please enter your name ");
        String password=console.getStringInput("Please enter your password ");
        CasinoAccountManager objmgr=new CasinoAccountManager();
       CasinoAccount objSlotPlayer=objmgr.getAccount(name,password);
      //  CasinoAccount objSlotPlayer=new CasinoAccount(name,password);
        return objSlotPlayer;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }


}