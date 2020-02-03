package ClassExercise;
/*
Tyler Choi
CS 211 Winter Quarter
01/10/2020

This class contains the main method where objects are created and called
printInfo() accepts the interface and outputs integers
 */

public class IncrementClient {

    public static void main (String args[]){
        SequentialIncrementer seq = new SequentialIncrementer(0); //starts with integer 0
        RandomIncrementer random = new RandomIncrementer();

        printInfo(seq);
        System.out.println();
        printInfo(random);

    }

    //accepts interface as parameter
    public static void printInfo(Incrementable i) {
        System.out.println("The number: " + i.getValue());
        i.increment();
        System.out.println("Incremented: " + i.getValue());
    }

}
