package lesson6;

public class Main2 {
    public static void main(String[] args) {
        int [] arrayNumbers = {1,6,8,14,10,12,4,9,2,11,5,7};
        for(int i = 0; i < arrayNumbers.length; i++) {
            int divideThree = ArrayNumbersDivideOn3.getDivideThree(arrayNumbers[i]);
            if(divideThree != 0) {
                System.out.println(divideThree);
            }

        }
    }

    }
