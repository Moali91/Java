package bankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountCLI {

    private static String custAddress;
    private static String custName;
    private static String accountName;
    private static double balance;




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer customer1 = new Customer(custName,custAddress);
        customer1.creatAccount();
        System.out.println(customer1.bankAccount.getBalance());
        System.out.println(customer1.bankAccount.getId());

        boolean exit = false;

        do {
            System.out.println("Type an opition. (Opitions: balance, get, put, exit)");
            String opition = scan.next();

            switch (opition.toLowerCase()) {
                case "balance":
                    System.out.println("Yout balance is: " + customer1.bankAccount.getBalance());
                    break;
                case "get":
                    System.out.println("Amount to withdraw:");
                    try {
                        double getAmount = scan.nextDouble();
                        if(customer1.bankAccount.getBalance()< getAmount){
                            System.out.println("You dont have enough money, your balance is: \n"+customer1.bankAccount.getBalance());
                            break;
                        }if(getAmount<0){
                            System.out.println("only positive numbers are accepted");
                            break;
                        }
                        customer1.bankAccount.withdraw(getAmount);
                        System.out.println("your balance is: " + customer1.bankAccount.getBalance());
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("invalid input. Please enter a number!");
                        break;
                    }
                case "put":
                    System.out.println("Amount to deposit:");
                    double putAmount = scan.nextDouble();
                    if(putAmount<0){
                        System.out.println("only positive numbers are accepted");
                        break;
                    }
                    customer1.bankAccount.deposit(putAmount);
                    System.out.println("your balance is: " + customer1.bankAccount.getBalance());
                    break;
                case "exit":
                    exit = true;
                    break;

                default:
                    System.out.println("please enter a correct option!");
                    break;
            }
        }while (!exit);

            scan.close();


    }
}
