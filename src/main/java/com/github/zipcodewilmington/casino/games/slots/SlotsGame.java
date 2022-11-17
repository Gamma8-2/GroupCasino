package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface {
    private SlotsPlayer _slotPlayer;
    int[][] _slotMatrix = new int[3][3];
    public void addPlayer(SlotsPlayer player){

    }
    @Override
    public void add(PlayerInterface player) {
    _slotPlayer= (SlotsPlayer) player;
    }

    @Override
    public void remove(PlayerInterface player) {

    }


    public void generateMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                _slotMatrix[i][j] = (int) (Math.random() * 6 + 1);
            }
        }

    }
    public void printMatrix(){
        for (int[] row : _slotMatrix)
            System.out.println(Arrays.toString(row));
    }

    @Override
    public void run() {
        int balance= _slotPlayer.get_slotPlayerBalance();
        _slotPlayer.set_slotPlayerBalance(balance-1);
        generateMatrix();
        StringBuilder sbRow = new StringBuilder();
        StringBuilder sbCol = new StringBuilder();
        StringBuilder sbDiag1 = new StringBuilder();
        StringBuilder sbDiag2 = new StringBuilder();
        ArrayList<String> al = new ArrayList<String>();
        int matLength = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sbRow.append(_slotMatrix[i][j]);
                sbCol.append(_slotMatrix[j][i]);
                if (i == j) {
                    sbDiag1.append(_slotMatrix[i][j]);
                }
                if (i + j == matLength) {
                    sbDiag2.append(_slotMatrix[matLength - j][j]);
                }
            }
            al.add(sbRow.toString());
            al.add(sbCol.toString());
            sbRow.delete(0, sbRow.length());
            sbCol.delete(0, sbCol.length());
        }
        al.add(sbDiag1.toString());
        al.add(sbDiag2.toString());

        printMatrix();
        int result=0;
        for (String str : al)
            if (str.equals("111") || str.equals("222") || str.equals("333") || str.equals("444") || str.equals("555") || str.equals("666"))
               result=1;
        if(result==1) {
            int total= _slotPlayer.get_slotPlayerBalance();
            _slotPlayer.set_slotPlayerBalance(balance+10);
            System.out.println("Congratulations you won the Game!"+_slotPlayer.get_slotPlayerName()+"and you have balance of"+_slotPlayer.get_slotPlayerBalance() );
        }  else System.out.println("Sorry better luck next time!" +_slotPlayer.get_slotPlayerName() +"and you have balance of"+_slotPlayer.get_slotPlayerBalance() );

    }

}




