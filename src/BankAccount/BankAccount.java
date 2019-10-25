package BankAccount;

public class BankAccount {

    private String bankAccountName;
    private int bankAccountId = (int) (Math.random()*500);
    private double balance;

    public BankAccount(String name, double balance){
        this.bankAccountName = name;
        this.balance = balance;
    }

    public void deposit(double put){
        balance += put;
    }

    public void withdraw(double take){
        balance -= take;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getId(){
        return this.bankAccountId;
    }


}
