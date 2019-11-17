public class CalculatorTDD {
    public static double square(double a) {
        return a * a;
    }

    public static double power(double a, double n) {
        return Math.pow(a,n);
    }

    public static double absolute(double a) {
        return Math.abs(a);//power(a * a, 0.5);
    }

    public static double reversal(double a) {
        if(a == 0){
            throw new IllegalArgumentException("Ty cholero nie dziel przez zero");
        }

        return 1/a;//pow(a,-1);
    }

    public static double squareReversal(double a) {
        return power(reversal(a),2);
    }

    public static double squareRoot(double a) {
        if(a < 0){
            throw new IllegalArgumentException("a musi być większe od zera");
        }

        return power(a,0.5);
    }

    public static double root(double a, double b) {
        if(a < 0 && b %2 == 0){
            throw new IllegalArgumentException("Nie ma pierwiastów parzystych z liczb ujemnych");
        }

        if(a < 0){
            throw new IllegalArgumentException("a nie może być mniejsze od zera");
        }

        return power(a, 1/b);
    }
}
