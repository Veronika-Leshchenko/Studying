package lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(6);
        nums.add(4);
        nums.add(7);

        // первый способ: for
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        // второй способ (он короче) // подходит для всех коллекций, которые имеют индексы или не имеют
        for (int num:nums) {
            System.out.println(num);

        }
        // с помощью итератора
        for (Iterator<Integer> iter = nums.iterator();iter.hasNext();){
            System.out.println(iter.next());

        }
    }
}
