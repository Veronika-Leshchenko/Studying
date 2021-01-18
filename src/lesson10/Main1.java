package lesson10;

public class Main1 {
    public static void main(String[] args) {
        DrobnoeChislo chislo1 = new DrobnoeChislo();
        chislo1.setDividend(5);
        chislo1.setDivisor(6);

        DrobnoeChislo chislo2 = new DrobnoeChislo();
        chislo2.setDividend(2);
        chislo2.setDivisor(4);

        CalcDrobey calculyator = new CalcDrobey();
        System.out.println(calculyator.add(chislo1, chislo2));
        System.out.println(calculyator.sub(chislo1, chislo2));
        System.out.println(calculyator.mul(chislo1, chislo2));
        System.out.println(calculyator.div(chislo1, chislo2));

    }
}
