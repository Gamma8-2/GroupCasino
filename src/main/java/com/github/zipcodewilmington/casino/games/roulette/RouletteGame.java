package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.RandomGame;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

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
        IOConsole console = new IOConsole(AnsiColor.BLUE);
        int balance = _roulettePlayer.get_roulettePlayerBalance();
        int playerNumberChoice = 0;
//        System.out.println("PLACE: Before main while loop, TESTING: " +
//                "Balance number - " + balance);

        while(gameRun){
//            System.out.println("Start of while loop, Balance number is: " + balance);

            System.out.println("Place your bets! Higher risk, higher reward!\n" +
                    "1. Odds (2-to-1 payout)\n" +
                    "2. Evens (2-to-1 payout)\n" +
                    "3. Number (10-to-1 payout)");
            int menuChoice = scanner.nextInt(); //TODO EXCEPTION HANDLE BEFORE SENDING TO SPIN WHEEL MESSAGE
            getValidMenuChoice(menuChoice);


            if(menuChoice == 3){
                System.out.println("What number will you choose? Number choices are 0 to 36");
                playerNumberChoice = scanner.nextInt();
            }
            int betAmount = getBettingAmount(balance);
            balance -= betAmount;
            System.out.println("Good luck!");

            balance = spinWheel(menuChoice, balance, betAmount, playerNumberChoice);

            //Switched from using Scanner to IO console, because at some point
            //code refused to stop for scanner call and pushed through to the playAgain method
            String playAgainPlayerInput = console.getStringInput("Play again? (y/n)");
            String lowerCasePlayAgainInput = playAgainPlayerInput.toLowerCase();
            boolean playAgainChoice = playAgain(lowerCasePlayAgainInput);
            if(playAgainChoice){
                System.out.println("Thank you for playing!");
                gameRun = false;
            }
        }

    }

    public int spinWheel(int menuChoice, int balance, int playerBet, int playerNumberChoice){

        int tableNumber = getRandomNumber(37);


        if(menuChoice == 1){ //TODO BETTING ON ODDS
        System.out.println("After rolling, the ball has landed on " + tableNumber);


            if(tableNumber % 2 == 1){
                playerBet *= 2;
                int newBalance = playerBet + balance;
                System.out.println("You win! A payout of: " + playerBet);
                updateAccountBalance(newBalance);
                String balanceUpdate = displayCurrentBalance(newBalance);
                System.out.println(balanceUpdate);
                return newBalance;
            }
            else{
                System.out.println("An even number. You lose :(");
                updateAccountBalance(balance);
                String balanceUpdate = displayCurrentBalance(balance);
                System.out.println(balanceUpdate);
                return balance;
            }
        }


        else if(menuChoice == 2){ //TODO BETTING ON EVEN
        System.out.println("After rolling, the ball has landed on " + tableNumber);


            if(tableNumber % 2 == 0){
                playerBet *= 2;
                int newBalance = balance + playerBet;
                System.out.println("You win! A payout of: " + playerBet);
                updateAccountBalance(newBalance);
                String balanceUpdate = displayCurrentBalance(newBalance);
                System.out.println(balanceUpdate);
                return newBalance;
            }
            else{
                System.out.println("An odd number. You lose :(");
                updateAccountBalance(balance);
                String balanceUpdate = displayCurrentBalance(balance);
                System.out.println(balanceUpdate);
                return balance;
            }
        }


        else if(menuChoice == 3){ //TODO BETTING ON SPECIFIC NUMBER

        System.out.println("After rolling, the ball has landed on " + tableNumber);


            if(tableNumber == playerNumberChoice){
                playerBet *= 10;
                int newBalance = balance + playerBet;
                System.out.println("You win! A payout of: " + playerBet);
                updateAccountBalance(newBalance);
                String balanceUpdate = displayCurrentBalance(newBalance);
                System.out.println(balanceUpdate);
                return newBalance;
            }
            else{
                System.out.println("It didn't land on your number. You lose :(");
                updateAccountBalance(balance);
                String balanceUpdate = displayCurrentBalance(balance);
                System.out.println(balanceUpdate);
                return balance;
            }


        }
        return balance;
    }

    public boolean playAgain(String playAgainChoice){ //Prompt player to play again

        if(!playAgainChoice.toLowerCase().equals("y") && !playAgainChoice.toLowerCase().equals("n")){
            System.out.println("Please make a valid choice");
            playAgain(playAgainChoice);
        }
        if(playAgainChoice.equals("y")){
            return false;
        }
        else return true;
    }

    public int getValidMenuChoice(int menuChoice){ //Validate menu choice, prompts for new input and runs again if invalid
        Scanner scanner = new Scanner(System.in);
        if (menuChoice > 3 || menuChoice < 1) {
            System.out.println("Please enter a valid choice");
            menuChoice = scanner.nextInt();
            getValidMenuChoice(menuChoice);
        }
        return menuChoice;
    }

    public int getBettingAmount(int balance){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to bet?");

        int playerBet = scanner.nextInt();

        if(playerBet > balance){
            System.out.println("You don't have that much to bet with!");
            getBettingAmount(balance);
        }

        return playerBet;
    }

    public void updateAccountBalance(int balance){
        //_roulettePlayer.set_roulettePlayerBalance(balance);
    }

    public String displayCurrentBalance(int balance){
        return "Your current balance is: " + balance;
    }


}
