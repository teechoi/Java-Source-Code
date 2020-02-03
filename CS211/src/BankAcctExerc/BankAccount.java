package BankAcctExerc;

public class BankAccount {

    private Startup s;
    private Debit d;
    private Credit c;


    public BankAccount(Startup s){
        this.s = s;
    }
    public void debit(Debit d){
        this.d = d;
    }
    public void credit(Credit c){
        this.c = c;
    }
    public double getBalance(){
        double balance = s.startupBalance() +d.getDebit() - c.getCredit();
        return balance;
    }
}
