package lesson4;

public class Main16 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 0, 0, 0, 2, 5},
                           {2, 0, 0, 0, 0, 0, 5},
                           {2, 0, 0, 0, 0, 0, 5},
                           {0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0},
                           {2, 0, 0, 0, 0, 0, 5},
                           {2, 0, 0, 0, 0, 0, 5},
                           {2, 4, 0, 0, 0, 2, 5}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers [i][j] == 0) {
                    System.out.print(numbers[i][j] + " ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

