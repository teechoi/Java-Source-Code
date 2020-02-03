package HW1;
/*
Tyler Choi
Homework Assignment 1
CS 211 Winter Quarter
01/12/2020

This class is to construct and initialize the Employee name
 */


public class Employee {
   String name;
   
   public Employee(String name) {
      this.name = name;
   }
   
   public String getName() {
      return name;
   }

   public String toString() {
      return getName();
   }
}