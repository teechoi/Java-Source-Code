package ClassExercise;
/*
Tyler Choi
In-Class Exercise #1
CS 211 Winter Quarter
01/13/2020

This class computes several methods utilizing an ArrayList<Integer>
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InClass01 {

    public static void main (String[] args) throws FileNotFoundException {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("Numbers.txt"));
        while (input.hasNextInt()) {
            int n = input.nextInt();
            numbers.add(n);
        }
        System.out.println(numbers);
        //alternatively, System.out.println(numbers + " " + numbers.size() + " numbers in the list");
        //above statement made the print too long, so separated into two
        System.out.println("There are " + numbers.size() + " numbers in the list");

        System.out.printf("The average Integer of the list is %.0f\n", getAverage(numbers)); //format rounds average to int
        maxMin(numbers);

//        System.out.println(Collections.max(numbers));
//        System.out.println(Collections.min(numbers));

        filterEvens(numbers);
        System.out.println(numbers + " - " + numbers.size() + " numbers in the list");

    }

    //returns average number of array list
    public static double getAverage(ArrayList<Integer> list){
        int total = 0;
        double average = 0;
        for (int i = 0; i<list.size(); i++){
            total += list.get(i);
        }
        average = (double) total/list.size();
        return average;

    }

    //computes max and min integer of array list
    public static void maxMin (ArrayList<Integer> list){
        int max = list.get(0); //initialize max and min numbers to first integer of list
        int min = list.get(0);
        for (int i = 1; i<list.size(); i++){
            max = Math.max(list.get(i), max);
            min = Math.min(list.get(i), min);
        }
        System.out.println("Maximum integer of the list is " + max);
        System.out.println("Minimum integer of the list is " + min);
    }

    //removes even numbers from array list
    public static void filterEvens(ArrayList<Integer> list) {
        for (int i = 0; i<list.size(); i++){
            int num = list.get(i);
            if (num % 2 == 0){
                list.remove(i);
                i--; //list decreases size each time an integer is removed
            }
        }
    }


}
