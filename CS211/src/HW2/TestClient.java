package HW2;
/*
Tyler Choi
CS 211 Winter Quarter
01/19/2020

* This class contains the test client for both Point class and TimeSpan class
* Creates objects for Point and TimeSpan and outputs modification and results of compareTo() method
 */

import java.util.ArrayList;
import java.util.Collections;

public class TestClient {
    public static void main(String[] args) {

        //create four Point objects
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        Point p3 = new Point (7, 2);
        Point p4 = new Point (10,9);

        //print each point and its distance from the origin
        System.out.println("p1 is " + p1);
        System.out.printf("distance from origin = %3.2f\n",
                p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.printf("distance from origin = %3.2f\n",
                p2.distanceFromOrigin());

        System.out.println("p3 is " + p3);
        System.out.printf("distance from origin = %3.2f\n",
                p3.distanceFromOrigin());

        System.out.println("p4 is " + p4);
        System.out.printf("distance from origin = %3.2f\n",
                p4.distanceFromOrigin());


        //create ArrayList to add point objects
        ArrayList<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);

        //call pointComparison method to compare distance to another
        pointComparison(p1, p2);
        pointComparison(p2, p3);
        pointComparison(p3, p1);
        pointComparison(p4, p2);

        //sort ArrayList of points in hierarchy of y-point
        Collections.sort(points);
        System.out.println("y-major order = " + points);

        //test client divider
        System.out.println("-------------------------");

        //create TimeSpan object
        int h1 = 13, m1 = 30;
        TimeSpan t1 = new TimeSpan(h1, m1);
        System.out.println("New object t1: " + t1);

        //add time to modify object
        h1 = 3; m1 = 40;
        System.out.println("Adding " + h1 + " hours, " + m1 + " minutes to t1");
        t1.add(h1, m1);
        System.out.println("New t1 state: " + t1);

        //create three new TimeSpan objects
        int h2 = 10, m2 = 50;
        TimeSpan t2 = new TimeSpan (h2, m2);
        System.out.println("New object t2: " + t2);

        int h3 = 16, m3 = 70;
        TimeSpan t3 = new TimeSpan (h3, m3);
        System.out.println("New object t3: " + t3);

        int h4 = 20, m4 = 10;
        TimeSpan t4 = new TimeSpan (h4, m4);
        System.out.println("New object t4: " + t4);

        //call timeComparison method to compare time to another
        timeComparison(t1, t2);
        timeComparison(t2, t3);
        timeComparison(t3, t1);
        timeComparison(t4, t2);

        //create ArrayList to add TimeSpan objects
        ArrayList<TimeSpan> times = new ArrayList<>();
        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);

        //sort ArrayList in hierarchy of longer time
        Collections.sort(times);
        System.out.println("Time order: " + times);


    }

    //method to compare point A to point B
    public static void pointComparison (Point firstPoint, Point secondPoint){
        if (firstPoint.compareTo(secondPoint) < 0){
            System.out.println(firstPoint + " comes before " + secondPoint);
        } else if (firstPoint.compareTo(secondPoint) == 0){
            System.out.println(firstPoint + " is equal to " + secondPoint);
        } else {
            System.out.println(firstPoint + " comes after " + secondPoint);
        }

    }

    //method to compare time A to time B
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
