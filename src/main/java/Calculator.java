/**
 * Klasa do wykonywania działań matematycznych
 */
public final class Calculator {
    /**
     * Metoda do dodawania dwóch liczb
     * @param numberA Pierwsza liczba wchodząca w skład działania
     * @param numberB Druga liczba wchodząca w skład działania
     * @return Suma dwóch liczb
     */
    public static double sum(double numberA, double numberB) {
        return numberA + numberB;
    }

    /**
     * Metoda do odejmowania dwóch liczb
     * @param numberA Pierwsza liczba wchodząca w skład działania
     * @param numberB Druga liczba wchodząca w skład działania
     * @return Różnica dwóch liczb
     */
    public static double substraction(double numberA, double numberB) {
        return numberA - numberB;
    }

    /**
     * Metoda do mnożenia dwóch liczb
     * @param multiplicand Mnożna
     * @param multiplier   Mnożnik
     * @return Iloczyn dwóch liczb
     */
    public static double multiply(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    /**
     * Metoda do dzielenia dwóch liczb
     * @param dividend Dzielna
     * @param divider  Dzielnik
     * @return Iloraz dwóch liczb
     */
    public static double divide(double dividend, double divider) {
        return dividend / divider;
    }

    /**
     * Metoda sprawdzajaca czy numer jest parzysty
     * @param number Sprawdzana liczba
     * @return Prawda jeżeli liczba jest parzysta, fałsz gdy jest nieparzysta
     */
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    /**
     * Metoda do obliczania liczb fibonaciego
     * @param n Identyfikator liczby fibonaciego
     * @return Liczba fibonaciego
     */
    public static int getFibonaciNumber(int n) {
        if (n <= 1) {
            return n;
        }

        return getFibonaciNumber(n - 1) + getFibonaciNumber(n - 2);
    }
}
