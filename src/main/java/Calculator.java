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
        if(divider == 0){
            throw new IllegalArgumentException("Ty cholero nie dziel przez 0");
        }

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

    public static double log(double a){
        if(a <= 0){
            throw new IllegalArgumentException("liczba a musi być większa od 0");
        }

        return Math.log(a);
    }

    public static double log(double a, double b){
        if(a <= 0 && b <= 0){
            throw new IllegalArgumentException("a oraz b musi być większe od 0");
        }

        if(a <= 0){
            throw new IllegalArgumentException("a musi być większe od 0");
        }

        if(b <= 0){
            throw new IllegalArgumentException("b musi być większe od 0");
        }

        if(a == 1){
            throw new IllegalArgumentException("a musi być różne od 1");
        }

        return log(b)/log(a);
    }

    public static double pow(double a, double b){
        return Math.pow(a,b);
    }

    public static double sqrt(double a){
        if(a < 0){
            throw new IllegalArgumentException("Liczba pierwiastkowana nie może być ujemna");
        }

        return Math.sqrt(a);
    }

    public static double square(double a){
        return a * a;
    }

    public static double root(double a, double b){
        if(a < 0 && b % 2 == 0){
            throw new IllegalArgumentException("a powinno być liczbą dodatnią jeżeli b jest parzyste");
        }

        if(a < 0){
            throw new IllegalArgumentException("a powinno być liczbą dodatnią");
        }

        if(b == 0){
            throw new IllegalArgumentException("b powinno być różne od zera");
        }

        return Math.pow(a, 1 / b);
    }
}
