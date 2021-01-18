package lesson9;

import java.util.concurrent.ThreadLocalRandom;

public class IgrovoePole {
    int[][] minnoePole;
    boolean[][] vidimoePole;

    public IgrovoePole(int colRows, int colColums) {
        minnoePole = new int[colRows][colColums];
        vidimoePole = new boolean[colRows][colColums];

    }

    public void addMinsToPole(int countMins) {
        for (int i = 0; i < countMins; i++) {
            addRandomMin();


        }
    }

    private void addRandomMin() {
        int row = ThreadLocalRandom.current().nextInt(0, minnoePole.length);
        int col = ThreadLocalRandom.current().nextInt(0, minnoePole[0].length);
        if (minnoePole[row][col] != -1) {
            minnoePole[row][col] = -1;
        } else {
            addRandomMin();


        }
    }

    public void printPole() {
        //   0  1  2  3  4  5  6  7  8
        String indexCols = "   ";
        for (int i = 0; i < minnoePole[0].length; i++) {
            indexCols = indexCols + i + "  ";
        }
        System.out.println(indexCols);
        for (int i = 0; i < minnoePole.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < minnoePole[i].length; j++) {
                if (vidimoePole[i][j] == true) {
                    System.out.print(minnoePole[i][j] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

    }

    public void printFinalPole() {


        for (int i = 0; i < minnoePole.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < minnoePole[i].length; j++) {
                if (minnoePole[i][j] == -1) {
                    System.out.print("*  ");
                } else {
                    System.out.print(minnoePole[i][j] + "  ");
                }


            }
            System.out.println();

        }
    }

    public void countAndFillMinsNum() {
        for (int i = 0; i < minnoePole.length; i++) {
            for (int j = 0; j < minnoePole[i].length; j++) {
                if (minnoePole[i][j] == -1) {
                    if (i == 0 && j == 0) { // угол верхний левый
                        if (minnoePole[0][1] != -1) {
                            minnoePole[0][1] = minnoePole[0][1] + 1;
                        }

                        if (minnoePole[1][1] != -1) {
                            minnoePole[1][1] = minnoePole[1][1] + 1;
                        }
                        if (minnoePole[1][0] != -1) {
                            minnoePole[1][0] = minnoePole[1][0] + 1;
                        }


                    } else if (i == 0 && j == minnoePole[i].length - 1) { // верхний правый угол
                        if (minnoePole[0][j - 1] != -1) {
                            minnoePole[0][j - 1] = minnoePole[0][j - 1] + 1;
                        }

                        if (minnoePole[i + 1][j - 1] != -1) {
                            minnoePole[i + 1][j - 1] = minnoePole[i + 1][j - 1] + 1;
                        }
                        if (minnoePole[i + 1][j] != -1) {
                            minnoePole[i + 1][j] = minnoePole[i + 1][j] + 1;
                        }

                    } else if (i == 0) { // верхний ряд
                        if (minnoePole[i + 1][j - 1] != -1) {
                            minnoePole[i + 1][j - 1] = minnoePole[i + 1][j - 1] + 1;
                        }

                        if (minnoePole[i + 1][j] != -1) {
                            minnoePole[i + 1][j] = minnoePole[i + 1][j] + 1;
                        }
                        if (minnoePole[i + 1][j + 1] != -1) {
                            minnoePole[i + 1][j + 1] = minnoePole[i + 1][j + 1] + 1;
                        }

                    }

                }

            }

        }
    }
}


