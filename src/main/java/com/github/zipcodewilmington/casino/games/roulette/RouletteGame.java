package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.RandomGame;

import java.util.Scanner;


public class RouletteGame extends RandomGame {

    private RoulettePlayer _roulettePlayer;

    @Override
    public void add(PlayerInterface player) {
        _roulettePlayer = (RoulettePlayer) player;
    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
        boolean gameRun = true;
        Scanner scanner = new Scanner(System.in);
        int balance = _roulettePlayer.get_roulettePlayerBalance();

        while(gameRun){

            int menuChoice = getMenuChoice();

            spinWheel(menuChoice, balance);

            System.out.println("Play again? (y/n)");
            String playAgainPlayerInput = scanner.nextLine();
            String lowerCasePlayAgainInput = playAgainPlayerInput.toLowerCase();
            boolean playAgainChoice = playAgain(lowerCasePlayAgainInput);
            if(playAgainChoice){
                System.out.println("Thank you for playing!");
                gameRun = false;
            }
        }

    }

    public void spinWheel(int menuChoice, int balance){
        Scanner scanner = new Scanner(System.in);
        int tableNumber = getRandomNumber(37);
        System.out.println("Your current balance is: " + balance);

        System.out.println("How much would you like to bet?");
        int playerBet = scanner.nextInt();
        balance -= playerBet;
        System.out.println("Good luck!");


        if(menuChoice == 1){ //TODO BETTING ON ODDS
        System.out.println("After rolling, the ball has landed on " + tableNumber);


            if(tableNumber % 2 == 1){
                playerBet *= 2;
                balance += playerBet;
                System.out.println("You win! A payout of: " + playerBet);
                updateBalance(balance);
                displayCurrentBalance(balance);
            }
            else{
                System.out.println("An even number. You lose :(");
                updateBalance(balance);
                displayCurrentBalance(balance);
            }
        }


        else if(menuChoice == 2){ //TODO BETTING ON EVEN
        System.out.println("After rolling, the ball has landed on " + tableNumber);


            if(tableNumber % 2 == 0){
                playerBet *= 2;
                balance += playerBet;
                System.out.println("You win! A payout of: " + playerBet);
                updateBalance(balance);
                displayCurrentBalance(balance);
            }
            else{
                System.out.println("An odd number. You lose :(");
                updateBalance(balance);
                displayCurrentBalance(balance);
            }
        }


        else if(menuChoice == 3){ //TODO BETTING ON SPEC NUM
            System.out.println("What number will you choose? Number choices are 0 to 36");
            int playerNumberChoice = scanner.nextInt();
        System.out.println("After rolling, the ball has landed on " + tableNumber);


            if(tableNumber == playerNumberChoice){
                playerBet *= 10;
                balance += playerBet;
                System.out.println("You win! A payout of: " + playerBet);
                updateBalance(balance);
                displayCurrentBalance(balance);
            }
            else{
                System.out.println("It didn't land on your number. You lose :(");
                updateBalance(balance);
                displayCurrentBalance(balance);
            }


        }
    }

    public boolean playAgain(String playAgainChoice){


        if(!playAgainChoice.toLowerCase().equals("y") && !playAgainChoice.toLowerCase().equals("n")){
            System.out.println("Please make a valid choice");
            playAgain(playAgainChoice);
        }
        if(playAgainChoice.equals("y")){
            return false;
        }
        else return true;
    }

    public int getMenuChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Place your bets! Higher risk, higher reward!\n" +
                "1. Odds (2-to-1 payout)\n" +
                "2. Evens (2-to-1 payout)\n" +
                "3. Number (10-to-1 payout)");
        int menuChoice = scanner.nextInt(); //TODO EXCEPTION HANDLE BEFORE SENDING TO SPIN WHEEL MESSAGE
        if (menuChoice > 3 || menuChoice < 1) {
            System.out.println("Please enter a valid choice");
            getMenuChoice();
        }
        return menuChoice;
    }

    public void updateBalance(int balance){;
        _roulettePlayer.set_roulettePlayerBalance(balance);
    }

    public void displayCurrentBalance(int balance){
        System.out.println("Your current balance is: " + balance);
    }
}
