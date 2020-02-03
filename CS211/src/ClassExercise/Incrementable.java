package ClassExercise;
/*
Tyler Choi
CS 211 Winter Quarter
01/10/2020

This is the Interface implemented by SequentialIncrementer and RandomIncrementer
Contains two methods increment() and getValue()
 */

//this interface describes common features
public interface Incrementable {

    void increment(); //public modifier is redundant for interface methods

    int getValue(); //interface methods do not have a body

}
