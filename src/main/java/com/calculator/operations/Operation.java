package com.calculator.operations;

/**
 * Μια αριθμητική πράξη που μπορεί να εκτελέσει η αριθμομηχανή.
 * <p>
 * Κάθε υλοποίηση καταχωρείται στον {@link com.calculator.CalculatorController}
 * με βάση το {@link #symbol()} της, το οποίο πρέπει να ταιριάζει με το κείμενο
 * του αντίστοιχου κουμπιού στο γραφικό περιβάλλον.
 */
public interface Operation {

    /**
     * Εφαρμόζει την πράξη σε δύο αριθμους.
     *
     * @param a ο πρώτος αριθμός
     * @param b ο δεύτερος αριθμός
     * @return το αποτέλεσμα της πράξης {@code a <op> b}
     */
    double calculate(double a, double b);

    /**
     * Επιστρέφει το σύμβολο που εμφανίζεται στο κουμπί και στο ιστορικό.
     *
     * @return το σύμβολο της πράξης, π.χ. {@code "+"}
     */
    String symbol();

}
