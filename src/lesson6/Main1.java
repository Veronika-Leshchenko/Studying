package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны AB: ");
        String sideAB = scanner.nextLine();
        double a = Double.parseDouble(sideAB);
        System.out.println("Введите длину стороны BC: ");
        String sideBC = scanner.nextLine();
        double b = Double.parseDouble(sideBC);
        System.out.println("Введите длину стороны CА: ");
        String sideCA = scanner.nextLine();
        double c = Double.parseDouble(sideCA);
        double result = AreaTriangle.getAreaTriangle(a, b, c);
        System.out.println("Площадь треугольника: " + result);

    }
}