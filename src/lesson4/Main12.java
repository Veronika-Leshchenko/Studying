package lesson4;

public class Main12 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 7, 0, 1, 2, 5},
                           {2, 4, 0, 0, 0, 2, 5},
                           {2, 0, 0, 0, 0, 0, 5},
                           {0, 0, 0, 0, 0, 0, 0},
                           {2, 0, 0, 0, 0, 0, 5},
                           {2, 4, 0, 0, 0, 3, 5},
                           {2, 4, 7, 0, 4, 2, 5}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i + j == 3 || (i + j == 4 && j <= 3 && i <= 3) || (i + j == 5 && i <= 4 && j <= 4) ||
                        (i + j == 6 && i <= 4 && j <= 4) || (i + j == 7 && i <= 5 && j <= 5) ||
                        (i + j == 8 && i <= 5 && j <= 5) || (i + j == 9 && i <= 6 && j <= 6)) {
                    System.out.print(numbers[i][j] + " ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



