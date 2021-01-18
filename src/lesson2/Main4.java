package lesson2;

public class Main4 {
    public static void main(String[] args) {
        for(int i = 100; i <= 1000; i = i + 1) {
            if(i % 5 == 0 && i % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}
