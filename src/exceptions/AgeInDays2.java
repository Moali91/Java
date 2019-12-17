package exceptions;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInDays2 {

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
            checkYear(yearOfBirth);

            System.out.println("In which month were you born? (e.g., 2 for February)");
            monthOfBirth = scanner.nextInt();
            checkMonths(monthOfBirth);

            System.out.println("On which day of the month were you born? (1-31)");
            dayOfBirth = scanner.nextInt();
            checkDays(dayOfBirth);

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



    private static void checkMonths(int input){
        if(input > 12 || input < 1){
            System.err.println("please enter a number less then 12 and bigger then 0");
            System.exit(1);
        }
    }

    private static void checkDays(int input){
        if(input > 31 || input < 1){
            System.err.println("please enter a number less then 31 and bigger then 0");
            System.exit(1);
        }
    }

    private static void checkYear(int input){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if(input <= 0 || input > year){
            System.err.println("please enter a number bigger then 0 and less or equal to "+ year);
            System.exit(1);
        }
    }

}
