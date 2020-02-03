package TicketExercise;

public class StudentAdvanceTicket extends AdvanceTicket {

    public StudentAdvanceTicket(int number, int days) {
        super (number, days);
    }
    public double getPrice(){
        return super.getPrice()/2;
    }
//
//    public String toString(){
//        double currPrice = super.getPrice();
//        return super.toString().replace(String.valueOf(currPrice), String.valueOf(currPrice / 2)) + " (ID required)";
//    }
    public String toString(){
        return super.toString() + " (ID required)";
    }
}
