package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email:");
        String email = scanner.next();

        // qwerr@ggree.sdo.ert
        String[] splitEmailByDog = email.split("@");
        if (splitEmailByDog.length != 2) {
            System.out.println("неверный формат!!! Не найдена точка после @");
            return;
        }

        if (splitEmailByDog[1].indexOf('.') == -1) {
            System.out.println("неверный формат!!! Точка в конце текста");
            return;

        }
        if (splitEmailByDog[1].endsWith(".")) {
            System.out.println("неверный формат!!! Не найдена точка после @");
            return;
        }
            if (splitEmailByDog.length != 2) {
                System.out.println("неверный формат!!! Две точки найдено");
                return;
        }
            System.out.println("Email нам полностью подходит");

        }
    }

