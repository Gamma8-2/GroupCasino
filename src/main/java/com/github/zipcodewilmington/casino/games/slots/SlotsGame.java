package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface {
    int[][] _slotMatrix = new int[3][3];
    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }


    public void generateMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                _slotMatrix[i][j] = (int) Math.random() * 6 + 1;
            }
        }
    }

    @Override
    public void run() {
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

        for (String str : al) {
            if (str.equals("111") || str.equals("222") || str.equals("333") || str.equals("444") || str.equals("555") || str.equals("666"))
              //  Update balance;
                System.out.println("uodatre balance");

        }
    }

}




