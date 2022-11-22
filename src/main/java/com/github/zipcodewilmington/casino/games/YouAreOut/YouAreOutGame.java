package com.github.zipcodewilmington.casino.games.YouAreOut;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.Collections;

public class YouAreOutGame implements GameInterface {
    ArrayList<Integer> nerfGun = new ArrayList<>();
    private YouAreOutPlayer youAreOutPlayer;
    private final IOConsole console = new IOConsole(AnsiColor.RED);

    public ArrayList<Integer> loadBarrel() {
        nerfGun.add(1);
        nerfGun.add(1);
        nerfGun.add(0);
        nerfGun.add(0);
        nerfGun.add(1);
        nerfGun.add(0);
        return nerfGun;
    }

    public ArrayList<Integer> shuffleBarrel() {
        Collections.shuffle(nerfGun);
        return nerfGun;
    }

    public int pullTrigger() {
        return nerfGun.get(0);
    }

    public void removeIndex() {
        nerfGun.remove(0);
    }

    public void printNerfGun() {
        System.out.println(nerfGun);
    }


    @Override
    public void add(PlayerInterface player) {
        youAreOutPlayer = (YouAreOutPlayer) player;
    }

    @Override
    public void remove(PlayerInterface player) {
    }

    @Override
    public void run() {
        String inputDecision = "Y";
        int balance = youAreOutPlayer.getYouAreOutPlayerBalance();
        youAreOutPlayer.setYouAreOutPlayerBalance(balance);
        balance = youAreOutPlayer.getYouAreOutPlayerBalance();
        int wager = 0;
        do {
            loadBarrel();
            shuffleBarrel();
            pullTrigger();
            wager = console.getIntegerInput("How much would you like to wager?");
            if (pullTrigger() == 0) {
                wager = wager + 5;
                balance = balance + wager;
                System.out.println("You dodged a bullet!\nYou won " + wager + "! Your current balance is " + balance + ".");
                console.getStringInput("Would you like to go again? Y/N?");
                if (inputDecision.equals("Y")) {
                    pullTrigger();
                    if (pullTrigger() == 0) {
                        wager = wager + 5;
                        balance = balance + wager;
                        System.out.println("You dodged a bullet!\nYou won " + wager + "! Your current balance is " + balance + ".");
                        removeIndex();
                        console.getStringInput("One last round! Would you like to go again? Y/N?");
                        if (inputDecision.equals("Y")) {
                            pullTrigger();
                            if (pullTrigger() == 0) {
                                wager = wager * 2;
                                balance = balance + wager;
                                System.out.println("You dodged a bullet!\nYou won " + wager + "! Your current balance is " + balance + ".");
                                console.getStringInput("Thank you for playing!");
                                inputDecision.equals("N");
                            }  if (pullTrigger() == 1) {balance = balance - wager * 2;
                            System.out.println("Darn! You are out! Better luck next time!");
                            inputDecision.equals("N");}
                        } if (inputDecision.equals("N")){System.out.println("Thank you for playing!\n You left with " + balance + ".");}
//                        inputDecision.equals("N");
                    } if(pullTrigger() == 1){balance = balance - wager - 10;
                    System.out.println("Too bad! You are out!!! You leave with " + balance + ".");
                    inputDecision.equals("N");}
                } if(inputDecision.equals("N")){System.out.println("Thank you for playing!\n You left with " + balance + ".");
                inputDecision.equals("N");}
            }
            balance = balance - wager;
            System.out.println("Too bad! You are out!!! Current balance is " + balance + ".");

        } while (inputDecision.equals("Y") && balance > 0);
    }
}
