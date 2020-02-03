package HW2;
/*
Tyler Choi
CS 211 Winter Quarter
01/19/20

This class implements interface Comparable and computes time in total minutes
 */
/*
 * Adapted for CS211 from Building Java Programs, 4th Edition,
 * by Stuart Reges and Marty Stepp
 * adapted by James Livingston, Bellevue College Adjunct Instructor
 */
// Represents a time span of elapsed hours and minutes.
// Simple implementation using only total minutes as state.
public class TimeSpan implements Comparable <TimeSpan> {
   private int totalMinutes;

   // Constructs a time span with the given interval.
   // pre: hours >= 0 && minutes >= 0
   public TimeSpan(int hours, int minutes) {
      totalMinutes = 0;
      add(hours, minutes);
   }
   
   // Adds the given interval to this time span.
   // pre: hours >= 0 && minutes >= 0
   public void add(int hours, int minutes) {
      totalMinutes += 60 * hours + minutes;
   }

   // Returns a String for this time span such as "6h15m".
   public String toString() {
      return (totalMinutes / 60) + "h"
             + (totalMinutes % 60) + "m";
   }

   //compares object fields and return negative, 0, or positive number
   public int compareTo(TimeSpan other) {
      return totalMinutes - other.totalMinutes;
   }
}
