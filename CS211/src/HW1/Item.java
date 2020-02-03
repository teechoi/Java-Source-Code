package HW1;
/*
Tyler Choi
Homework Assignment 1
CS 211 Winter Quarter
01/12/2020

This class contains information on Items that will be purchased
Item name, price, and discount are displayed
 */

public class Item {
   private String name;
   private double price;
   private double discount;

   public Item(String name, double price, double discount) { // Constructor 
      this.name = name;
      this.price = price;
      this.discount = discount;
	}
   
   // Accessor methods   
   public String getName() {
      return name;
   }
   
   public double getPrice() {
      return price;
   }
   
   public double getDiscount() {
      return discount;
   }
   
   public String toString() { // toString method for printing the receipt
		return name + ": $" + price + " (-$" + discount + ")";
   }

}
   