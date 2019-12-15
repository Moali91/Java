package arrayLists;

public class BankAccount {
    private double balance;


    BankAccount(double balance){
        this.balance = balance;
    }


    public void deposit(double put){
        this.balance += put;
    }

    public void withdraw(double take){
        this.balance-=take;
    }

    public double getBalance(){
        return this.balance;
    }

}
