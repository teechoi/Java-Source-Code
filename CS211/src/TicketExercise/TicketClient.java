package TicketExercise;

public class TicketClient {
    public static void main (String[] args){

        Ticket t1 = new WalkUpTicket(1);
        Ticket t2 = new AdvanceTicket(2, 12);
        Ticket t3 = new AdvanceTicket (3,8);
        Ticket t4 = new StudentAdvanceTicket(4, 11);
        Ticket t5 = new StudentAdvanceTicket(5,7);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
