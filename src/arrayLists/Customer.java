package arrayLists;

import java.util.Scanner;

public class Customer {
    private String customerName;
    private String address;
    BankAccount bankAccount;

    Customer(String name, String address){
        this.customerName = name;
        this.address = address;
    }

    public void creatAccount(){
        String name = null;
        Double balance = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name!");
        name = scan.nextLine();
        System.out.println("Please enter intial balance!");
        balance = scan.nextDouble();
        this.bankAccount = new BankAccount(balance);
    }


    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
