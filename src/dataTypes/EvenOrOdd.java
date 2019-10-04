package dataTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {



    static void oddTester(int number){

        if(number%2==0){
            System.out.println("the number "+number+" is even");
        }
        else
        System.out.println("the number "+number+" is odd");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int input;
        try {
            input = scan.nextInt();
            oddTester(input);
        }catch (InputMismatchException e){
            System.out.println("Invalid input - you must enter an Integer!!!");
        }
        scan.close();
    }
}
