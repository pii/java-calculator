package com.calculator.operations;

/**
 * Η πράξη του πολλαπλασιασμού.
 * <p>
 * Πολλαπλασιάζει τους δύο αριθμους και αντιστοιχεί στο κουμπί
 * {@code *} απο το κουμπιουτερακι.
 *
 * @see Operation
 */
public class Multiplication implements Operation{

    /**
     * Επιστρέφει το γινόμενο των δύο αριθμων.
     *
     * @param a ο πρώτος αριθμος
     * @param b ο δεύτερος αριθμος
     * @return το γινόμενο {@code a * b}
     */
    @Override
    public double calculate(double a, double b) {
        return a*b;
    }

    /**
     * Επιστρέφει το σύμβολο του πολλαπλασιασμού.
     *
     * @return {@code "*"}
     */
    @Override
    public String symbol() {
        return "*";
    }
}
