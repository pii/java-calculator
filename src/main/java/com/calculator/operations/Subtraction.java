package com.calculator.operations;
/**
 * Η πράξη της αφαίρεσης.
 * <p>
 * Αφαιρεί τον δεύτερο αριθμό από τον πρώτο και αντιστοιχεί στο κουμπί
 * {@code -} του calculator.
 * @see Operation
 */
public class Subtraction implements Operation {
    /**
     * Επιστρέφει τo αποτελέσμα δύο αριθμών.
     * <p>
     * Η σειρά των αριθμών έχει σημασία: {@code calculate(5, 3)} θα επιστρέφει
     * {@code 2}, ενώ {@code calculate(3, 5)} θα επιστρέφει {@code -2}.
     * @param a ο αρχικός αριθμός
     * @param b ο αφαιρετέος
     * @return η διαφορά {@code a - b}
     */
    @Override
    public double calculate(double a, double b) {
        return a-b;
    }
    /**
     * Επιστρέφει το σύμβολο της αφαίρεσης.
     * @return {@code "-"}
     */
    @Override
    public String symbol() {
        return "-";
    }
}
