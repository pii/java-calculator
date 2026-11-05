package com.calculator.operations;
/**
 * Η πράξη της διαίρεσης.
 * <p>
 * Διαιρεί τον πρώτο τελεστέο με τον δεύτερο και αντιστοιχεί στο κουμπί
 * {@code /} της αριθμομηχανής.
 *
 * @see Operation
 */
public class Division implements Operation{
    /**
     * Επιστρέφει το πηλίκο των δύο τελεστέων.
     * <p>
     *
     * @param a ο διαιρετέος
     * @param b ο διαιρέτης
     * @return το πηλίκο {@code a / b}
     */
    @Override
    public double calculate(double a, double b) {
        return a/b;
    }
    /**
     * Επιστρέφει το σύμβολο της διαίρεσης.
     *
     * @return {@code "/"}
     */
    @Override
    public String symbol() {
        return "/";
    }
}
