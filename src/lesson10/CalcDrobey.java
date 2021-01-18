package lesson10;

public class CalcDrobey implements FractionNumberOperation {


    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        // a = 5/6
        // b = 2/4
        int obshiyZnamenatel = a.getDivisor() * b.getDivisor();
        int obshiyChislitel = a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend();
        DrobnoeChislo result = new DrobnoeChislo();
        result.setDivisor(obshiyZnamenatel);
        result.setDividend(obshiyChislitel);

        return reduceFraction(result);

    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int obshiyZnamenatel = a.getDivisor() * b.getDivisor();
        int obshiyChislitel = a.getDividend() * b.getDivisor() - a.getDivisor() * b.getDividend();
        DrobnoeChislo result = new DrobnoeChislo();
        result.setDivisor(obshiyZnamenatel);
        result.setDividend(obshiyChislitel);

        return reduceFraction(result);
    }


    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int obshiyZnamenatel = a.getDivisor() * b.getDivisor();
        int obshiyChislitel = a.getDividend() * b.getDividend();
        DrobnoeChislo result = new DrobnoeChislo();
        result.setDivisor(obshiyZnamenatel);
        result.setDividend(obshiyChislitel);

        return reduceFraction(result);
    }


    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int obshiyZnamenatel = a.getDivisor() * b.getDividend();
        int obshiyChislitel = a.getDividend() * b.getDivisor();
        DrobnoeChislo result = new DrobnoeChislo();
        result.setDivisor(obshiyZnamenatel);
        result.setDividend(obshiyChislitel);

        return reduceFraction(result);
    }

    public static int greatestCommonDivisor(int m, int n) {
        if (n == 0)
            return m;
        else
            return greatestCommonDivisor(n, m % n);
    }

    public static DrobnoeChislo reduceFraction(DrobnoeChislo f) {
        int g = greatestCommonDivisor(f.getDividend(), f.getDivisor());
        DrobnoeChislo a = new DrobnoeChislo();
        a.setDividend(f.getDividend() / g);
        a.setDivisor(f.getDivisor() / g);
        return a;
    }
}
