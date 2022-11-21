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

    public ArrayList<Integer> loadBarrel(){
        nerfGun.add(0);
        nerfGun.add(0);
        nerfGun.add(0);
        nerfGun.add(0);
        nerfGun.add(1);
        nerfGun.add(0);
        return nerfGun;
    }

    public ArrayList<Integer> shuffleBarrel(){
        Collections.shuffle(nerfGun);
        return nerfGun;
    }

    public void pullTrigger(){
        System.out.println(nerfGun.get(0));
    }

    public void removeIndex(){
        nerfGun.remove(0);
    }
    public void printNerfGun(){
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
        int balance = youAreOutPlayer.getYouAreOutPlayerBalance();
        youAreOutPlayer.setYouAreOutPlayerBalance(balance - 1);
        balance = youAreOutPlayer.getYouAreOutPlayerBalance();
    }
}
