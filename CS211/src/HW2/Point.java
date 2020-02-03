package HW2;
/*
Tyler Choi
CS 211 Winter Quarter
01/19/20

This class implements interface Comparable and utilizes (x, y) coordinates
 */

// A Point object represents a pair of (x, y) coordinates.
// Class invariant: x >= 0 && y >= 0. (Quadrant I only)

public class Point implements Comparable<Point> {
   private int x;
   private int y;

   // Constructs a new point at the given (x, y) location.
   // pre: x >= 0 && y >= 0
   public Point(int x, int y) {
      if (x < 0 || y < 0) {
         throw new IllegalArgumentException();
      }
      this.x = x;
      this.y = y;
   }

   // Constructs a new point at the origin, (0, 0).
   public Point() {
      this(0, 0);    // calls Point(int, int) constructor
   }

   // Returns the distance between this Point and (0, 0).
   public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
   }

   // Returns whether o refers to a point with the same (x, y)
   // coordinates as this point. Robust version.
   public boolean equals(Object o) {
      if (o instanceof Point) {
         Point other = (Point) o;
         return this.x == other.getX() && this.y == other.getY();
      } else {  // not a Point object
         return false;
      }
   }

   // Returns the x-coordinate of this point.
   public int getX() {
      return this.x;
   }

   // Returns the y-coordinate of this point.
   public int getY() {
      return this.y;
   }

   // Returns a String representation of this point.
   public String toString() {
      return "(" + this.x + ", " + this.y + ")";
   }

   // Returns a new point, shifted from this one by dx and dy.
   // pre: x + dx >= 0 && y + dy >= 0
   public Point translate(int dx, int dy) {
      return new Point(this.x + dx, this.y + dy);
   }

   //method compares fields and returns negative, 0, or positive number
   public int compareTo(Point other) {
      if (this.y != other.y){
         return this.y - other.y;
      } else {
         return this.x - other.x;
      }
   }

}
