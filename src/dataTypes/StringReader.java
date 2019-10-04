package dataTypes;

import java.util.Scanner;

public class StringReader {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scan.nextLine();
        String output = input.substring(1).toUpperCase().replace('A','Z')+"-ready!";
        System.out.println(output);



    }

}
