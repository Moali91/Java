package designingClasses_p1;

public class CashRegisterSimplified {
    private double purchase;
    private double payment;

    public void recordPurchase(double amount){
        purchase += amount;
    }

    public void payCash(int coinCount, Coin coinType){
        payment += coinCount*coinType.getValue();
    }
    public double giveChange(){
        double change = payment-purchase;
        purchase = 0.0;
        payment = 0.0;
        return change;
    }


}
