package HW1;
/*
Tyler Choi
Homework Assignment 1
CS 211 Winter Quarter
01/12/2020

This class shows the Grocery bill that will be created from item purchase
Adds item to bill and prints receipt
 */


public class GroceryBill {
   private double total_price;
   private int item_count;
   private Item receipt[];
   private Employee clerk;

   public GroceryBill(Employee clerk) { // Constructor with Employee parameter
      total_price = 0;
      item_count = 0;
      receipt = new Item[25];
      this.clerk = clerk;
   }
      
   public void add(Item i) { // Mutator method for adding an item 
      total_price += i.getPrice();
      receipt[item_count] = i;
      item_count += 1;
   }
   
   // Accessor methods 
   public double getTotal() {
      return total_price;
   }
      
   public int getItemCount() {
      return item_count; 
   }
   
   public String getCashierName() {
      return clerk.getName();
   }
   
   public void printReceipt() { // Printing the bill
      System.out.println(receiptToString()); 
      System.out.println("Cashier Name: " + getCashierName());
      System.out.println("Total: $" + this.getTotal());
   }
   
   public String receiptToString() {
		String receiptText = "Items:\n";
		for(int i = 0; i < item_count; i++) {
			receiptText += receipt[i];
			receiptText += "\n";
			}
		return receiptText;
      }
}