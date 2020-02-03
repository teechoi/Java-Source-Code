package HW1;
/*
Tyler Choi
Homework Assignment 1
CS 211 Winter Quarter
01/12/2020

This class contains the main method for client testing
Creates an array of items
Shows difference in receipts with and without a discount
 */

public class DiscountTest {

    public static void main (String args[]){

        GroceryBill normalBill = new DiscountBill(new Employee("Trader"), false);
        GroceryBill discountBill = new DiscountBill(new Employee("Joe"), true);

        Item items[] = {new Item("Cauliflower", 30, 10),
                        new Item("Onion", 24, 8),
                        new Item("Avocado", 18, 0),
                        new Item("Beans", 15, 5)};

        for (int i = 0; i < items.length; i++){ //for-loop to add items to grocery bill
            normalBill.add(items[i]);
            discountBill.add(items[i]);
        }

        normalBill.printReceipt(); //print bill with no discount
        discountBill.printReceipt(); //print bill with discount

    }

}
