package lesson2;

public class Main6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = -20; i <= 30; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
