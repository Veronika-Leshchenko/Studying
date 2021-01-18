package lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("-- Круг");
        System.out.println("-- Прямоугольник");
        System.out.println("-- Треугольник");
        System.out.println("-- Эллипс");
        System.out.println("-- Трапеция");
        System.out.println("-- Октагон");
        System.out.println("-- Тетраэдр");
        System.out.println("-- Дельтоид");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.nextLine();
        String radius = scanner.nextLine();
        double r = Double.parseDouble(radius);


        List figurs = Arrays.asList("круг", "прямоугольник", "треугольник", "эллипс",
                "трапеция", "октагон", "тетраэдр", "дельтоид");
        if (!figurs.contains(inputFigura.toLowerCase())) { // Не содержит введенную фигуру. Проверка в нижнем регистре.
            System.out.println("Нет такой фигуры!!!");
            return;
        }

        System.out.println("Площадь или периметр?");
        String inputAction = scanner.nextLine();

        if (!(inputAction.equalsIgnoreCase("Площадь") ||
                inputAction.equalsIgnoreCase("Периметр"))) {
            System.out.println("Введено неверное значение!!!");
            return;
        }

        if (inputFigura.equalsIgnoreCase("Круг")) {
            System.out.println("Введите радиус: ");
//            String radius = scanner.nextLine();
//            double r = Double.parseDouble(radius);
            if(scanner.hasNextDouble()) {
//                double r = scanner.nextDouble();
                System.out.println("Спасибо! Вы ввели радиус" + r);
            }else {
                System.out.println("Извините, но это явно не радиус. Перезапустите программу и попробуйте снова!");
            }
        }


//                String radius = scanner.nextLine();
//                double r = Double.parseDouble(radius);
////                double r = scanner.nextDouble();
//                System.out.println("Спасибо! Вы ввели радиус" + r);
//            }else {
//                System.out.println("Извините, но это явно не радиус. Перезапустите программу и попробуйте снова!");
//            }
//        }
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (r * r))); // S = ╥r²
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр круга " + (Math.PI * (2 * r))); // P = 2╥r
            } else {
                System.out.println("Введено неверное значение!!!");
            }
        }
//        if(scanner.hasNextDouble()) {
//            double r = scanner.nextDouble();
//            System.out.println("Спасибо! Вы ввели радиус" + r);
//        }else {
//            System.out.println("Извините, но это явно не радиус. Перезапустите программу и попробуйте снова!");
//        }
//    }
}
