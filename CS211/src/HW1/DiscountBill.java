package HW1;
/*
Tyler Choi
Homework Assignment 1
CS 211 Winter Quarter
01/12/2020

This class DiscountBill inherits code from class GroceryBill
Provides info on discounted items
 */

public class DiscountBill extends GroceryBill {

    private int discountCount;
    private boolean preferred;
    private double discountAmount;

    public DiscountBill (Employee clerk, boolean preferred){ //Constructor with parent class and boolean parameter
        super(clerk);
        this.preferred = preferred;
        discountCount = 0; //initialize new fields
        discountAmount= 0;
    }

    public void add (Item i){ //Mutator method for adding an item
        super.add(i);
        if (preferred && i.getDiscount() > 0){ //if boolean is true and discount exists
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    public int getDiscountCount(){
        return discountCount;
    }

    public double getDiscountAmount(){
        return discountAmount;
    }

    public double getTotal(){
        return super.getTotal()-discountAmount;
    }

    public double getDiscountPercent(){
        return discountAmount*100/super.getTotal();
    }

    public void printReceipt() { // Printing the bill with discount info
        super.printReceipt();
        System.out.println("Discount Item(s): " + getDiscountCount());
        System.out.println("Discount Amount: $" + getDiscountAmount());
        System.out.printf("Discount Percent: %.1f%%%n", getDiscountPercent()); //special format for cleaner output
        System.out.println("----------------------"); //show end of receipt
    }
}
