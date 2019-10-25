package designingClasses_p1;


public class CashRegisterSimplifiedTest {

    public static void main(String[] args) {
        CashRegisterSimplified register = new CashRegisterSimplified() ;
        Coin c1 = new Coin(0.1,"Zähni");
        Coin c2 = new Coin(0.2,"Zwängi");
        Coin c3 = new Coin(0.5,"Füfzgi");

        register.recordPurchase(1.60);
        register.payCash(4,c3);

        System.out.println(register.giveChange());
    }
}
