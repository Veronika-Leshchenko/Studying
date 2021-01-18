package lesson12;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {2,3,2,2,1,2,3,4,4,5,3,3,2};

        HashSet<Integer> set = new HashSet<>();

        for (int num:numbers) {
            set.add(num);

        }
        System.out.println(set);
    }
}
