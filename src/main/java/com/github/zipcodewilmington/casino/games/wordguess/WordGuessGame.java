package com.github.zipcodewilmington.casino.games.wordguess;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Random;

public class WordGuessGame implements GameInterface {

    //   public static void main(String[] args){
    String[] dictionary_list = {"ant", "bat", "cat", "dad", "egg", "fan", "gem", "hen", "ink", "jug", "kid", "log", "men", "nun", "owl", "put", "qis", "rat", "sun", "tan", "urn", "van", "web", "xen", "yak", "zoo"};
    String random_word;
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);

    private WordGuessPlayer _wordGuessPlayer;

    String guess_word;
    int random_number;
    boolean win = false;
    Random random = new Random();


    //  }

    @Override
    public void add(PlayerInterface player) {
        _wordGuessPlayer = (WordGuessPlayer) player;
    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
        String inputDecision = "Y";

        do {

            boolean gameStatus = false;
            win = false;
            int balance = _wordGuessPlayer.get_wordGuessPlayerBalance();
            _wordGuessPlayer.set_wordGuessPlayerBalance(balance - 1);
            balance = _wordGuessPlayer.get_wordGuessPlayerBalance();
            random_word = dictionary_list[(int) (Math.random() * dictionary_list.length)];
            random_number = random.nextInt(3);

            if (random_number == 0) {
                guess_word = console.getStringInput("please guess a three letter word your hint : " + random_word.charAt(0) + " _ " + " _ ");

            } else if (random_number == 1) {
                guess_word = console.getStringInput("please guess a three letter word your hint : " + " _ " + random_word.charAt(1) + " _");

            } else
                guess_word = console.getStringInput("please guess a three letter word your hint : " + " _ " + " _ " + random_word.charAt(2));

            //guess_word = console.getStringInput("please guess a three letter word your hint : " + random_word.charAt(0));

              gameStatus = wordEngine(guess_word, random_word,balance,_wordGuessPlayer.get_wordGuessPlayerName());

               if (gameStatus && win) {
                _wordGuessPlayer.set_wordGuessPlayerBalance(balance + 10);
                int total = _wordGuessPlayer.get_wordGuessPlayerBalance();
                System.out.println(" Congratulations \"" + _wordGuessPlayer.get_wordGuessPlayerName() + "\" you got it and your new balance is " + total);
            }

            inputDecision = console.getStringInput("Do you want to continue Y/N ?");

        } while (inputDecision.equals("Y"));
    }

    public boolean wordEngine(String guessword, String ranword, int gameBalance, String wordGuessPlayerName) {
        if (ranword.equals(guessword)) {
            win = true;
            return true;
        } else {
            System.out.println(" better luck next time \"" + wordGuessPlayerName + "\" and your balance is " + gameBalance + "\" and Secret word is " + ranword);
        }
       return false;
    }

}
