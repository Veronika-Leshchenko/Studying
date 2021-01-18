package lesson12;

import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Синий", "Шариковая", 120);
        Pen pen2 = new Pen("Синий", "Шариковая", 120);
        Pen pen3 = new Pen("Красная", "Шариковая", 44);
        Pen pen4 = new Pen("Розовая", "Гелевая", 1200);
        Pen pen5 = new Pen("Черная", "Шариковая", 130);

        HashSet<Pen> pens = new HashSet<>();
        pens.add(pen5);
        pens.add(pen3);
        pens.add(pen2);
        pens.add(pen1);
        pens.add(pen4);

        for (Pen pen:pens) {
            System.out.println(pen);

        }
    }
}
