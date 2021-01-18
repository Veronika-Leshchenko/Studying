package lesson5;

import java.lang.*;
import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String s = "adds";
        Date date = new Date();
        // формула создания объекта
        int a = 8;
        // 1 - тип переменной
        // 2 - название переменной
        // 3 - = (сам объект) или new и вызов спец.метода по названию совпадает с названием типа


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String inputPassword = scanner.next();
        if (inputPassword.length() < 8) {

            char[] chars = inputPassword.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                    System.out.println("Надёжный пароль");
                    return;


                }
            }
        }
    }
}
