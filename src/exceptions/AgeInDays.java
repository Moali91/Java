package exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInDays {


    /*
     * This exercise computes your age in days.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = 0;
        int monthOfBirth = 0;
        int dayOfBirth = 0;

        System.out.println("In which year were you born? (e.g., 1950)");
        try {
            yearOfBirth = scanner.nextInt();
            System.out.println("In which month were you born? (e.g., 2 for February)");
            monthOfBirth = scanner.nextInt();
            if(monthOfBirth > 12 || monthOfBirth < 1){
                System.err.println("please enter a number less then 12 and bigger then 0 ");
                monthOfBirth = scanner.nextInt();
            }
            System.out.println("On which day of the month were you born? (1-31)");
            dayOfBirth = scanner.nextInt();
            if(dayOfBirth > 31 || dayOfBirth < 1){
                System.err.println("please enter a number less then 31 and bigger then 0 ");
                dayOfBirth = scanner.nextInt();
            }
            LocalDate birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
            LocalDate now = LocalDate.now();
            long days = birthDay.until(now, ChronoUnit.DAYS);
            System.out.println("You were born on " + birthDay + ".");
            System.out.println("Today is " + now + ".");
            System.out.println("You are " + days + " days old.");
        }
        catch (InputMismatchException e){
            System.err.println("please enter a number!!");
        }
        catch (DateTimeException e){
            System.err.println("Invalid date!! "+ dayOfBirth +" because -> "+ yearOfBirth +" is not leap year!");
        }

        scanner.close();
    }
}
