package ClassExercise;
/*
Tyler Choi
CS 211 Winter Quarter
01/10/2020

This class SequentialIncrementer implements code from the interface
Increments and shows value provided by client
 */

public class SequentialIncrementer implements Incrementable {

    private int value;

    //constructor for initializing value
    public SequentialIncrementer(int i) {
        this.value = i;
    }

    //increments value by 1
    public void increment() {
        value++;
    }

    //returns integer value
    public int getValue() {
        return value;
    }
}
