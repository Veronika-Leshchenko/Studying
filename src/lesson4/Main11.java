package lesson4;

public class Main11 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 7, 4},
                           {2, 6, 4, 6},
                           {1, 4, 6, 8},
                           {1, 4, 6, 8}};
        for (int i = 0; i < numbers.length; i++) { // внешний цикл, и он как одномерный массив с тремя строками
            for (int j = 0; j < numbers[i].length; j++) { // внутренний цикл j по столбцам i
                if (i == j) {
                    System.out.print(numbers[i][j] + " ");
                }else {
                    System.out.print(" " + " ");

                }

            }
            System.out.println(); // после выхода из внутреннего цикла, мы видим нужный нам массив
        }
    }
}

