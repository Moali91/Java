package exercisesSchool;

public class InterestCalcu {
    public static void main(String[] args) {
        double initialBalance = 1234.50;
        double interestRate = 0.05;
        double balanceDec = ((1+interestRate/100)*initialBalance);

        System.out.println(balanceDec);
    }
}
