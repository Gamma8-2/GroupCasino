package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {
    SlotsGame objSlotGame=new SlotsGame();
    private int winAmount=0;

    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
    public void run() {
    int balance=50;
        System.out.println("Would you like to play Slots! Y ? N?");
        String userInput=System.console().readLine();

        if(userInput=="Y"){
            objSlotGame.generateMatrix();
            objSlotGame.run();
        }
        if(winAmount!=0) System.out.println("Hey You won "+winAmount+" !");
        else System.out.println("Better luck next time");
    }


}