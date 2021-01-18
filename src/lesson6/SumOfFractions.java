package lesson6;


public class SumOfFractions {
    public static double getSumOfFractions(double numerator, double denominator, double numerator1,
                                           double denominator1) {
        double result = ((denominator1 * numerator) / (denominator1 * denominator) +
                (denominator * numerator1) / (denominator * denominator1));
        return result;
    }
}
