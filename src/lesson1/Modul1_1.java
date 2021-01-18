package lesson1;

public class Modul1_1 {
    public static void main(String[] args) {

        double square_length_1 = 2;
        double square_width_1 = 1.5;
        double square_length_2 = 2;
        double square_width_2 = 1.5;

        if (square_length_1 == square_width_1 && square_length_2 == square_width_2) {
            System.out.println("Квадрат!");
        } else if (square_length_1 == square_length_2 && square_width_1 == square_width_2) {
            System.out.println("Параллелограмм!");
        } else {
            System.out.println("Четырехугольник");

        }
    }
}