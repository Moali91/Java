package dataTypes;

public class ExtendedCashRegisterTest {
    public static void main(String[] args) {
        ExtendedCashRegister register = new ExtendedCashRegister();

        register.recordPurchase(0.75);
        register.recordPurchase(1.5);
        register.payDollars(2);
        register.payDimes(3);
        System.out.println("Change: ");
        System.out.printf("%.2f \n",register.giveChange());
        System.out.println("expected: 0.05");
    }
}
