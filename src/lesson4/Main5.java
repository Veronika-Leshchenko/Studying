package lesson4;

public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        int summ = 0;
        for (int day = 0; day < 366; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++){
                        System.out.printf("Со старта прошло: %d дня, %d часа, %d минут, %d секунд \n", day, hour, min, sec);
                        Thread.sleep(1000);

                    }

                }
            }
        }
//        System.out.println(summ);
    }
}
