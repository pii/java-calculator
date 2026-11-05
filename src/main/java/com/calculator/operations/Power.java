package com.calculator.operations;
/**
 * Η πράξη της ύψωσης σε δύναμη.
 * <p>
 * Υψώνει τον πρώτο τελεστέο (βάση) στη δύναμη του δεύτερου (εκθέτης)
 * και αντιστοιχεί στο κουμπί {@code ^} της αριθμομηχανής.
 *
 * @see Operation
 * @see Math#pow(double, double)
 */
public class Power implements Operation {
    /**
     * Επιστρέφει τη δύναμη {@code a} υψωμένο στο {@code b}.
     * <p>
     *
     * @param a η βάση
     * @param b ο εκθέτης
     * @return η δύναμη {@code a^b}
     */
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
    /**
     * Επιστρέφει το σύμβολο της ύψωσης σε δύναμη.
     *
     * @return {@code "^"}
     */
    @Override
    public String symbol() {
        return "^";
    }
}
