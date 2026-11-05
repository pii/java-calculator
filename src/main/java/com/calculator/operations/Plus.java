package com.calculator.operations;

/**
 * Η πράξη της πρόσθεσης.
 * <p>
 * Προσθέτει τους δύο αριθμους και αντιστοιχεί στο κουμπί {@code +}
 * του κουμπιουτερακη.
 *
 * @see Operation
 */
public class Plus implements Operation {

    /**
     * Επιστρέφει το άθροισμα των δύο τελεστέων.
     *
     * @param a ο πρώτος αριθμος
     * @param b ο δεύτερος αριθμος
     * @return το αποτελεσμα της προσφεσης {@code a + b}
     */
    @Override
    public double calculate(double a, double b) {
        return a+b;
    }

    /**
     * Επιστρέφει το σύμβολο της πρόσθεσης.
     * @return {@code "+"}
     */
    @Override
    public String symbol() {
        return "+";
    }
}
