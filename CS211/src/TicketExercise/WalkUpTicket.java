package TicketExercise;

public class WalkUpTicket extends Ticket {

    //private double price;

    public WalkUpTicket(int number) {
        super(number);
    }

    public double getPrice() {
        //this.price = 50;
        return 50;
    }

//    public String toString(){
//        return super.toString() + ", Price: " + getPrice();
//    }
}
