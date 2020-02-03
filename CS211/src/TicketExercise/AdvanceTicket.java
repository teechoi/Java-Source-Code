package TicketExercise;

public class AdvanceTicket extends Ticket {

    //private double price;
    private int days;

    public AdvanceTicket(int number, int days) {
        super(number);
        this.days = days;
    }

    public double getPrice() {
        if (days >= 10){
            return 30;
        } else {
            return 40;
        }
        //return price;
    }


}
