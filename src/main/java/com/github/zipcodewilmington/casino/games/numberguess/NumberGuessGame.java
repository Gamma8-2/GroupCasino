package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame implements GameInterface {
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private NumberGuessPlayer _numberGuessPlayer;
    int count = 1;
    Integer guess;

    //Creating a mystery number
    Random random = new Random();
    Integer mysteryNum = random.nextInt(100) + 1;

    @Override
    public void add(PlayerInterface player) {
        _numberGuessPlayer= (NumberGuessPlayer) player;
    }



    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
        boolean gameStatus = false;
        do{
            guess = console.getIntegerInput("Please select a number to guess mystery number between 1 and 100 in 4 attempts");
            count++;

            gameStatus = guessNumberEngine(guess, mysteryNum, count);


        }while(!gameStatus);
        }

    public boolean guessNumberEngine(Integer guessFromUser, Integer systemNum, int numAttempts) {


        if (guessFromUser == systemNum) {
            System.out.println("Congratulations your find the mystery number in " + numAttempts + " attempts");
            return true;
        }

        else if (guessFromUser > systemNum) {
            System.out.println("your guess is bigger than mystery number");
            //numAttempts++;
                    if (numAttempts > 4) {
                        System.out.println("you exceeded the number of attempts");
                        return true;
                    }
            return false;
        } else {
            System.out.println("your guess is less than mystery number");
            //numAttempts++;
                    if (numAttempts > 4) {
                        System.out.println("you exceeded the number of attempts");
                        return true;
                    }
            return false;
        }


    }
}
