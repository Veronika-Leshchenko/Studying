package lesson6;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayNumbers.length; i++) {
            int evenNumbers = ArrayNumbers.getEvenNumbers(arrayNumbers[i]);
            if (evenNumbers != 0) {
                System.out.print(evenNumbers + " ");
            }
        }


    }
}

