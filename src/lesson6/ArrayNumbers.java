package lesson6;

public class ArrayNumbers {
    public static int getEvenNumbers(int numbers) {
        int result;
        if (numbers % 2 == 0) {
            result = numbers;
        } else {
            result = 0;
        }
        return result;
    }
}

