package dataTypes;


public class CashRigisterTest {
    public static void main(String[] args) {
        CashRigister register = new CashRigister();

        register.recordPurches(0.75);
        register.recordPurches(1.50);
        register.payCash(2,0,5,0,0);
        System.out.println("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 0.25");

        System.out.println(register.changeToQuarters(2));
        System.out.println("Expected: 8");

        System.out.println(CashRigister.QUARTER_VALUE);
        System.out.println("expected: 0.25");

        register.recordPurches(2.25);
        register.recordPurches(19.25);
        register.payCash(23,2,0,0,0);
        System.out.println("Change: ");
        System.out.println(register.giveChange());
        System.out.println("expected: 2.0");
    }
}
