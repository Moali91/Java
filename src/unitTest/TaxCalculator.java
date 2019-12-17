package unitTest;


public class TaxCalculator {

    public enum Status {
        SINGLE, MARRIED
    }

    private static final double LOW_RATE = 0.10;
    private static final double HIGH_RATE = 0.25;

    private static final double SINGLE_LIMIT = 32000;
    private static final double MARRIED_LIMIT = 64000;

    /** Calculate income tax for income and filing status. */
    public static double calculateTax(double income, Status status) {
        if (status == Status.SINGLE) {
            if (income <= SINGLE_LIMIT) {
                return LOW_RATE * income;
            } else {
                return LOW_RATE * SINGLE_LIMIT
                        + HIGH_RATE * (income - SINGLE_LIMIT);
            }
        } else {
            if (income <= MARRIED_LIMIT) {
                return LOW_RATE * income;
            } else {
                return LOW_RATE * MARRIED_LIMIT
                        + HIGH_RATE * (income - MARRIED_LIMIT);
            }
        }
    }
}
