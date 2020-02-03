package ClassExercise;
/*
Tyler Choi
CS 211 Winter Quarter
01/10/2020

This class RandomIncrementer implements code from the interface
Shows randomized value when incremented and returned
 */

import java.util.Random;

public class RandomIncrementer implements Incrementable {

    Random random = new Random();

    //randomize integer
    public void increment() {
        random.nextInt();
    }

    //return randomized integer
    public int getValue() {
        return random.nextInt();
    }
}
