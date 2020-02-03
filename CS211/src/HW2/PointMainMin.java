package HW2;
/*
Tyler Choi
CS 211 Winter Quarter
01/19/20

This class contains initial test client for Point class
 */

// A client program that deals with simple points.
// Minimal version, to accompany immutable Point class.

import java.util.ArrayList;
import java.util.Collections;

public class PointMainMin {
   public static void main(String[] args) {
      // create three Point objects
      Point p1 = new Point(7, 2);
      Point p2 = new Point(4, 3);
      Point p3 = new Point (7, 2);

      // print each point and its distance from the origin
      System.out.println("p1 is " + p1);
      System.out.printf("distance from origin = %3.2f\n",
                            p1.distanceFromOrigin());
   
      System.out.println("p2 is " + p2);
      System.out.printf("distance from origin = %3.2f\n",
                            p2.distanceFromOrigin());

      System.out.println("p3 is " + p3);
      System.out.printf("distance from origin = %3.2f\n",
              p3.distanceFromOrigin());

      //creat ArrayList to store Point objects
      ArrayList<Point> points = new ArrayList<>();
      points.add(p1);
      points.add(p2);
      points.add(p3);

      pointComparison(p1, p2);
      pointComparison(p2, p3);
      pointComparison(p3, p1);

      //sort points in y-major order
      Collections.sort(points);
      System.out.println("y-major order = " + points);

   }

   //method to compare point parameters
   public static void pointComparison (Point firstPoint, Point secondPoint){
      if (firstPoint.compareTo(secondPoint) < 0){
         System.out.println(firstPoint + " comes before " + secondPoint);
      } else if (firstPoint.compareTo(secondPoint) == 0){
         System.out.println(firstPoint + " is equal to " + secondPoint);
      } else {
         System.out.println(firstPoint + " comes after " + secondPoint);
      }

   }

}
