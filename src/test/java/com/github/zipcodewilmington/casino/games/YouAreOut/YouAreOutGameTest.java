package com.github.zipcodewilmington.casino.games.YouAreOut;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class YouAreOutGameTest {
    YouAreOutGame game = new YouAreOutGame();

    @Test
    public void loadBarrelTest(){
        //given: a new game...instantiated at the top
        //when: you load the array
        ArrayList<Integer> actual = game.loadBarrel();
        //then: you can print the array?????
        System.out.println(actual);
    }

    @Test
    public void shuffleBarrel(){
        //given: a loaded array
        game.loadBarrel();
        //when you shuffle your array
        ArrayList<Integer> actual = game.shuffleBarrel();
        //them: print it out??
        System.out.println(actual);
    }

    @Test
    public void pullTriggerTest(){
        //given a loaded and shuffled array
        game.loadBarrel();
        game.shuffleBarrel();
        //when you pull the trigger
        game.pullTrigger();
        //then: the value is shown and gives the appropriate result
    }

    @Test
    public void removeIndex(){
        //given: a loaded and shuffled array in which the trigger is pulled
        game.loadBarrel();
        game.shuffleBarrel();
        game.pullTrigger();
        //when: you remove that index
        game.removeIndex();
        //then: you should have an array that is only 5 indexes long...
        game.printNerfGun();
    }
}
