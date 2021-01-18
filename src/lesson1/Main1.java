package lesson1;

public class Main1 {
    public static void main (String[] args) {
        int money = 30000;
        int tripCost = 75000;
        int monthToTrip = 3;
        int salary = 20000;
        int monthlyExpended = 10000;

        int savedMoney = money + (salary * monthToTrip) - (monthToTrip * monthlyExpended);
        if(savedMoney >= tripCost && tripCost < 60000 && salary > 30000){
            System.out.println("Поедем!");
        }else {
            System.out.println("Не поедем! У нас только " + savedMoney);

        }
    }
}
