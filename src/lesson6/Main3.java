package lesson6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числитель первой дроби: ");
        double numerator = sc.nextDouble();
        System.out.println("Введите знаменатель первой дроби: ");
        double denominator = sc.nextDouble();
        System.out.println("Введите числитель второй дроби: ");
        double numerator1 = sc.nextDouble();
        System.out.println("Введите знаменатель второй дроби: ");
        double denominator1 = sc.nextDouble();
        double summaFractions = SumOfFractions.getSumOfFractions(numerator, denominator, numerator1, denominator1);
        System.out.println("Сумма дробей: " + summaFractions);


    }

}
