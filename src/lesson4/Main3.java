package lesson4;

public class Main3 {
    public static void main(String[] args) {
        int[][] chessDesk = new int[8][8];

        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    chessDesk[i][j] = 1;
                }
                System.out.print(chessDesk[i][j] + " ");
            }
            System.out.println();
        }
    }

}

