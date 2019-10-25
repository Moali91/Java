package dataTypes;

public class CashRigister {
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.1;
    public static final double QUARTER_VALUE = 0.25;

    private double purchase;
    private double payment;

    public void recordPurches(double amount){
        purchase += amount;
    }

    public void payCash(int dollars, int quarters, int dimes, int nickels, int pennies){
        this.payment = dollars+QUARTER_VALUE*quarters + DIME_VALUE*dimes + NICKEL_VALUE*nickels + PENNY_VALUE*pennies;
    }
    public double giveChange(){
        double change = payment-purchase;
        purchase = 0.0;
        payment = 0.0;
        return change;
    }

    public double changeToQuarters(int dollars){
        return dollars/0.25;
    }
}
