package BankAcctExerc;

public class MinMaxAccount extends BankAccount {

    private int minBalance;
    private int maxBalance;

    public MinMaxAccount (Startup startup){
        super(startup);
    }

    public int getMin(){
        return minBalance;
    }

    public int getMax(){
        return maxBalance;
    }
}
