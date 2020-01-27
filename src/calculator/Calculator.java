package calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    //private static final String OPERATOR_MATCHER = "(\\+|\\-|\\*|\\/)";

    public static double compute(String str){
        Scanner scanner = new Scanner(str);
        Pattern number = Pattern.compile("^[0-9]+([,.][0-9]?)?$");
        Pattern operator = Pattern.compile("[+\\-*:/]");
        Matcher numberMatch1 = number.matcher(scanner.next());
        double num = 0;
        if(numberMatch1.find()) {
            num = Double.valueOf(numberMatch1.group());
        }
        while (scanner.hasNext()){
            Matcher operatorMatch = operator.matcher(scanner.next());
            Matcher numberMatch2 = number.matcher(scanner.next());
            if(!operatorMatch.find() || !numberMatch2.find()) {
                scanner.close();
                throw new IllegalArgumentException();
            }
            switch(operatorMatch.group()) {
                case "+": num+= Double.valueOf(numberMatch2.group());
                    break;
                case "-": num-= Double.valueOf(numberMatch2.group());
                    break;
                case "*": num*= Double.valueOf(numberMatch2.group());
                    break;
                case ":": num/= Double.valueOf(numberMatch2.group());
                    break;
                case "/": num/= Double.valueOf(numberMatch2.group());
                    break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Calculator.compute(scanner.nextLine()));
    }
}
