package lesson13;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(10, 10);
        double[][] data = {{5, 600, 10, 15},
                           {542, 36, 85, 52},
                           {70, 45, 7, 50},
                           {30, 15, 10, 60}};
        double[][] data1 = {{1, 574, 5, 6},
                            {481, 1, 52, 44},
                            {68, 2, 1, 46},
                            {18, 5, 4, 20}};

//        double[][] data2 = new double[3][4];

        Matrix matrix2 = new Matrix(data);
        Matrix matrix3 = new Matrix(data1);
        System.out.println(matrix2.getValueAt(2,4));
        System.out.println(matrix2.getValueAt(2,1) + "\n");
        IMatrix addResult = matrix2.add(matrix3);
        addResult.printToConsole(); // Ещё не понимаю как пропустить строчку на консоли, чтобы отделить результаты по сложениею, вычитанию, умножению и т.д. матриц

        IMatrix subResult = matrix2.sub(matrix3);
        subResult.printToConsole();

        IMatrix mulResult = matrix2.mul(matrix3);
        mulResult.printToConsole();


//        System.out.println(subResult + "\n");

    }
}
