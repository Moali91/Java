package dataTypes;

import java.math.BigDecimal;

/**
 * Simple cash register
 *
 * @author Mohammed Ali
 * @version 1.0
 */
public class ExtendedCashRegister {
    /**
     *These are final instance variables,"Final" because they will never change
     * we use BigDecimal to represent numbers to avoid losing money, since floating point numbers may lead
     * to a precision loss.
     */
    public static final BigDecimal PENNY_VALUE = new BigDecimal(0.01);
    public static final BigDecimal NICKEL_VALUE = new BigDecimal(0.05);
    public static final BigDecimal DIME_VALUE = new BigDecimal(0.1);
    public static final BigDecimal QUARTER_VALUE = new BigDecimal(0.25);

    /**
     * initial them to zero
     */
    private BigDecimal purchase = BigDecimal.ZERO;
    private BigDecimal payment = BigDecimal.ZERO;

    /**
     * we add amount to the purchase value
     * @param amount price of the item
     */
    public void recordPurchase(double amount){
        purchase = purchase.add(BigDecimal.valueOf(amount));
    }

    /** process the cash payment
     *
     * @param dollars number of dollars
     * @param quarters number of quarters
     * @param dimes number of dimes
     * @param nickles number of nickles
     * @param pennies number of pennies
     */
    public void payCash(int dollars, int quarters, int dimes, int nickles, int pennies){
        payment = BigDecimal.valueOf(dollars).add(QUARTER_VALUE.multiply(BigDecimal.valueOf(quarters)))
                .add(DIME_VALUE.multiply(BigDecimal.valueOf(dimes))).add(NICKEL_VALUE.multiply(BigDecimal.valueOf(nickles)))
                .add(NICKEL_VALUE.multiply(BigDecimal.valueOf(pennies)));
    }

    /**
     * pay with dollars
     * @param dollars number of dollars
     */
    public void payDollars(int dollars){
        payment = payment.add(BigDecimal.valueOf(dollars));
    }

    /**
     * pay in quarters
     * @param quarters number of quarters
     */
    public void payQuarters(int quarters){
        payment = payment.add(QUARTER_VALUE.multiply(BigDecimal.valueOf(quarters)));
    }

    /**
     * pay in dimes
     * @param dimes number of dimes
     */
    public void payDimes(int dimes){
        payment = payment.add(DIME_VALUE.multiply(BigDecimal.valueOf(dimes)));
    }

    /**
     * pay in nickles
     * @param nickles number of nickles
     */
    public void payNickles(int nickles){
        payment = payment.add(NICKEL_VALUE.multiply(BigDecimal.valueOf(nickles)));
    }

    /**
     * pay in pennies
     * @param pennies number of pennies
     */
    public void payPennies(int pennies){
        payment = payment.add(PENNY_VALUE.multiply(BigDecimal.valueOf(pennies)));
    }

    /**
     * change dollars to quarters
     * @param dollars amount in dollars to change
     * @return number of quarters
     */
    public double changeToQuarters(int dollars){
        return dollars/QUARTER_VALUE.doubleValue();
    }

    /**
     * finish purchase and return the rest of money
     * @return change due to customer
     */
    public double giveChange(){
        BigDecimal change = payment.subtract(purchase);
        purchase = BigDecimal.ZERO;
        payment = BigDecimal.ZERO;
        return change.doubleValue();
    }
}


