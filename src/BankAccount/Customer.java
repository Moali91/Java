package BankAccount;

import java.util.Scanner;

public class Customer {

    private String customerName;
    private String customerAddress;
    BankAccount bankAccount;

    public  Customer(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;

    }

    public void creatAccount(){
        String name = null;
        Double balance = null;
        Scanner scann = new Scanner(System.in);
        System.out.println("Creat a new Account");
        System.out.println("Write your name: ");
        this.customerName = scann.nextLine();
        System.out.println("Write your Address: ");
        this.customerAddress = scann.nextLine();
        System.out.println("Type of the account (e.g. Salary)?");
        name = scann.nextLine();
        System.out.println("Initial balance:");
        balance = scann.nextDouble();
        this.bankAccount = new BankAccount(name,balance);

    }


    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

}
