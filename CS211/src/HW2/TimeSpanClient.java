package HW2;
/*
Tyler Choi
CS 211 Winter Quarter
01/19/20

This class contains initial test client for TimeSpan class
 */

import java.util.ArrayList;
import java.util.Collections;

/*
 * TimeSpanClient: a simple test client for the TimeSpan class
 * Shows creation of an instance object, displaying that object,
 * adding hours and minutes to that object, and showing the result.
 */
 public class TimeSpanClient {
    public static void main(String[] args) {
        int h1 = 13, m1 = 30;
        TimeSpan t1 = new TimeSpan(h1, m1);
        System.out.println("New object t1: " + t1);
        
        h1 = 3; m1 = 40;
        System.out.println("Adding " + h1 + " hours, " + m1 + " minutes to t1");        
        t1.add(h1, m1);
        System.out.println("New t1 state: " + t1);


        int h2 = 10, m2 = 50;
        TimeSpan t2 = new TimeSpan (h2, m2);
        System.out.println("New object t2: " + t2);

        int h3 = 16, m3 = 70;
        TimeSpan t3 = new TimeSpan (h3, m3);
        System.out.println("New object t3: " + t3);

        timeComparison(t1, t2);
        timeComparison(t2, t3);
        timeComparison(t3, t1);

        ArrayList<TimeSpan> times = new ArrayList<>();
        times.add(t1);
        times.add(t2);
        times.add(t3);

        Collections.sort(times);
        System.out.println("Time order: " + times);


    }
    //method to compare time parameters
    public static void timeComparison(TimeSpan firstTime, TimeSpan secondTime){
        if (firstTime.compareTo(secondTime) < 0){
            System.out.println(firstTime + " is less than " + secondTime);
        } else if (firstTime.compareTo(secondTime) == 0){
            System.out.println(firstTime + " is equal to " + secondTime);
        } else {
            System.out.println(firstTime + " is greater than " + secondTime);
        }
    }
}