package lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3 {
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
            String radius = scanner.nextLine();
            double r = Double.parseDouble(radius);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (r * r))); // S = ╥r²
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр круга " + (Math.PI * (2 * r))); // P = 2╥r
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Прямоугольник")) {
            System.out.println("Введите длину прямоугольника: ");
            String lengthA = scanner.nextLine();
            double a = Double.parseDouble(lengthA);
            System.out.println("Введите ширину прямоугольника: ");
            String widthC = scanner.nextLine();
            double c = Double.parseDouble(widthC);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                double areaRectangle = a * c;
                System.out.println("Площадь прямоугольника: " + areaRectangle);
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                double perimeter = 2 * (a + c);
                System.out.println("Периметр прямоугольника: " + perimeter);
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Треугольник")) {
            System.out.println("Введите длину стороны AB: ");
            String lengthSideAB = scanner.nextLine();
            double ab = Double.parseDouble(lengthSideAB);
            System.out.println("Введите длину стороны BC: ");
            String lengthSideBC = scanner.nextLine();
            double bc = Double.parseDouble(lengthSideBC);
            System.out.println("Введите длину стороны CA: ");
            String lengthSideCA = scanner.nextLine();
            double ca = Double.parseDouble(lengthSideCA);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите радиус описанной окружности: ");
                String radius = scanner.nextLine();
                double r = Double.parseDouble(radius);
                double areaTriangle = (ab * bc * ca) / (4 * r);
                System.out.println("Площадь треугольника: " + areaTriangle);
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                double perimeter = ab + bc + ca;
                System.out.println("Периметр треугольника: " + perimeter);
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Эллипс")) {
            System.out.println("Введите длину большой полуоси A: ");
            String lengthMajorSemiAxisA = scanner.nextLine();
            double a = Double.parseDouble(lengthMajorSemiAxisA);
            System.out.println("Введите длину малой полуоси B: ");
            String lengthMinorSemiAxisB = scanner.nextLine();
            double b = Double.parseDouble(lengthMinorSemiAxisB);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь эллипса: " + (Math.PI * a * b)); // S = ╥ * a * b
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр эллипса: " + 4 * (Math.PI * a * b + Math.pow((a - b), 2)) / (a + b));
                // P = 4 * (╥ ab + (a - b)²) / (a + b)
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Трапеция")) {
            System.out.println("Введите основание A: ");
            String baseA = scanner.nextLine();
            double a = Double.parseDouble(baseA);
            System.out.println("Введите основание B: ");
            String baseB = scanner.nextLine();
            double b = Double.parseDouble(baseB);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите высоту h: ");
                String heightH = scanner.nextLine();
                double h = Double.parseDouble(heightH);
                System.out.println("Площадь трапеции: " + (a + b) / 2 * h);
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Введите длину боковой стороны C: ");
                String lengthSideC = scanner.nextLine();
                double c = Double.parseDouble(lengthSideC);
                System.out.println("Введите длину боковой стороны D: ");
                String lengthSideD = scanner.nextLine();
                double d = Double.parseDouble(lengthSideD);
                System.out.println("Периметр трапеции: " + a + b + c + d);
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Октагон")) {
            System.out.println("Введите сторону восьмиугольника A: ");
            String SideA = scanner.nextLine();
            double a = Double.parseDouble(SideA);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь октагона: " + 2 * Math.pow(a, 2) * (Math.sqrt(2) + 1));
                // S = 2 * a² * (1 + √2)
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр октагона: " + (8 * a));
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Тетраэдр")) {
            System.out.println("Введите длину ребра тетраэдра A: ");
            String lengthRibA = scanner.nextLine();
            double a = Double.parseDouble(lengthRibA);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь тетраэдра: " + Math.sqrt(3) * Math.pow(a, 2)); // S = √3a²
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр тетраэдра: " + (6 * a));
            } else {
                System.out.println("Введено неверное значение!!!");
            }

        } else if (inputFigura.equalsIgnoreCase("Дельтоид")) {
            System.out.println("Введите длину стороны A: ");
            String lengthSideA = scanner.nextLine();
            double a = Double.parseDouble(lengthSideA);
            System.out.println("Введите длину стороны B: ");
            String lengthSideB = scanner.nextLine();
            double b = Double.parseDouble(lengthSideB);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите угол между сторонами L: ");
                String angleBetweenSidesL = scanner.nextLine();
                double l = Double.parseDouble(angleBetweenSidesL);
                System.out.println("Площадь дельтоида: " + (a * b) * Math.sin(Math.toRadians(l)));
                // S = (a * b) * sin(l)
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр дельтоида: " + 2 * (a + b));
            }
        }
    }
}






