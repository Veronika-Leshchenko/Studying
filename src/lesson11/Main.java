package lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("qqq");
        texts.add("www");
        texts.add("eee");
        texts.add("rrr");

//        texts.add(0,"!!!");
        texts.set(0, "???");
//        texts.add(100, "sdgjgjfkvb"); // появится ошибка, так как нет сотого элемента

        System.out.println(texts.contains("???"));


        System.out.println(texts);
        System.out.println(texts.get(1));
        texts.remove(1);
    }
}
