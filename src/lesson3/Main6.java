package lesson3;

public class Main6 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] dcba = new char[abcd.length]; // объявляем пустой массив, чтобы его заполнить

        int index1 = 0;
        int index2 = abcd.length - 1; // 3
        for (int i = 0; i < 4; i++) { // можно взять любой диапазон, главное чтобы цикл крутился четыре раза
            dcba[index1] = abcd[index2];
            index1++;
            index2--;
        }

//        for (int i = abcd.length - 1; i >= 0; i--) {
//            System.out.print(abcd[i]);
        System.out.println(dcba);
        System.out.println(abcd);

        }

    }
