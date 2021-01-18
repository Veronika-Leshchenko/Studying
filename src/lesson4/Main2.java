package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int[][] chessDesk = new int[8][8];

        for (int i = 0; i < chessDesk.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < chessDesk[i].length; j += 2) {
                    chessDesk[i][j] = 1;
//                    System.out.print(chessDesk[i][j] + " ");
                }
            }
        }
        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {

//                chessDesk[i][j] = 1;
                    System.out.print(chessDesk[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
