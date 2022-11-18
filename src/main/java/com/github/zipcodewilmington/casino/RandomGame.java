package com.github.zipcodewilmington.casino;

import java.util.Random;
import java.util.Scanner;

public class RandomGame implements GamblingGame{

    @Override
    public void placeBet() {

    }

    @Override
    public void receivePayout() {

    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }

    public int getRandomNumber(int upperBound){
        Random random = new Random();
        return random.nextInt(upperBound);
    }
}
