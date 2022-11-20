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

    boolean win = false;

    //Creating a mystery number
    Random random = new Random();
  //  Integer mysteryNum = random.nextInt(100) + 1;

    @Override
    public void add(PlayerInterface player) {
        _numberGuessPlayer= (NumberGuessPlayer) player;
    }



    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

        String inputDecision="Y";


        do {
            boolean gameStatus = false;
            int balance = _numberGuessPlayer.get_numGuessPlayerBalance();
            _numberGuessPlayer.set_numGuessPlayerBalance(balance - 1);
            count = 1;
            win = false;
            Integer mysteryNum = random.nextInt(100) + 1;

                do {

                    guess = console.getIntegerInput("Please select a number to guess mystery number between 1 and 100 in 4 attempts, your current account balance is " + balance);
                    count++;
                    balance = _numberGuessPlayer.get_numGuessPlayerBalance();
                    gameStatus = guessNumberEngine(guess, mysteryNum, count, balance);

                      // int balance = _numberGuessPlayer.get_numGuessPlayerBalance();
                      if (gameStatus && win) {
                          _numberGuessPlayer.set_numGuessPlayerBalance(balance + 10);
                          int total = _numberGuessPlayer.get_numGuessPlayerBalance();
                          System.out.println("Congratulations your find the mystery number in " + count + " attempts and your balance is " + total);
                      }


                   } while (!gameStatus);

              inputDecision=console.getStringInput("Do you want to continue Y/N ?");

        } while(inputDecision.equals("Y"));


        }

    public boolean guessNumberEngine(Integer guessFromUser, Integer systemNum, int numAttempts, int curBalance) {

      // String inputDecision="Y";

      // do{

            if (guessFromUser == systemNum) {
                win = true;
                return true;

            } else if (guessFromUser > systemNum) {
                System.out.println("your guess is bigger than mystery number");
                //numAttempts++;
                if (numAttempts > 4) {
                    System.out.println("you exceeded the number of attempts and your balance is " + curBalance);
                    return true;
                }
                return false;
            } else {
                System.out.println("your guess is less than mystery number");
                //numAttempts++;
                if (numAttempts > 4) {

                    System.out.println("you exceeded the number of attempts and your balance is " + curBalance);
                  //  inputDecision = console.getStringInput("Do you want to continue Y/N ?");
                    return true;
                }
                return false;
            }


    }



}
