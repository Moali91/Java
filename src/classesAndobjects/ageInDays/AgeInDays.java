package classesAndobjects.ageInDays;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeInDays {

    public static void ageInday() {
        int year, month, day;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Year ");
            year = scanner.nextInt();
        } while (year < 1000 || year > 2019);
        do {
            System.out.println("Month ");
            month = scanner.nextInt();
        } while (month<1 || month>12);
        do {
            System.out.println("Day");
            day = scanner.nextInt();
        }while (day < 1 || day >31);
        LocalDate now = LocalDate.now();
        LocalDate userBirth= LocalDate.of(year,month,day);

        long ageDays = userBirth.until(now, ChronoUnit.DAYS);
        System.out.println("You were born on "+year+"-"+month+"-"+day);
        System.out.println("today is "+ now);
        System.out.println(ageDays);

        scanner.close();
    }

    public static void main(String[] args) {
        AgeInDays.ageInday();

    }



}
