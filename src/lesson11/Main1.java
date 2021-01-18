package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<100000; i++) {
            arrayList.add(0,"lsfjsk" + i);

        }
        long andTime = System.currentTimeMillis();
        System.out.println("метод add arrayList -" + (andTime - startTime));

        LinkedList<String> linkedList = new LinkedList<>();
        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i<100000; i++) {
            linkedList.add(0,"lsfjsk" + i);

        }
        long andTime1 = System.currentTimeMillis();
        System.out.println("метод add linkedList -" + (andTime1 - startTime1));
        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i<100000; i++) {
            arrayList.get(i);

        }
        long andTime2 = System.currentTimeMillis();
        System.out.println("метод get arrayList -" + (andTime2 - startTime2));


        long startTime3 = System.currentTimeMillis();
        for(int i = 0; i<100000; i++) {
            linkedList.get(i);

        }
        long andTime3 = System.currentTimeMillis();
        System.out.println("метод get linkedList -" + (andTime3 - startTime3));
    }


}
