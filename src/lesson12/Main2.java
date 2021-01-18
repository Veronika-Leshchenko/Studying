package lesson12;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> resept = new HashMap<>();
        resept.put("Яблоко", 200);
        resept.put("Груша", 300);
        resept.put("Слива", 500);
        resept.put("Сливки", 700);
        resept.put("Груша", 200 + resept.get("Груша"));


        System.out.println(resept);

        int[] numbers = {2,3,2,2,1,2,3,4,4,5,3,3,2};
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (Integer num: numbers){
            if(counter.containsKey(num)) {
                counter.put(num, 1 + counter.get(num));
            }else {
                counter.put(num, 1);

            }
        }
        System.out.println(counter);
    }
}
