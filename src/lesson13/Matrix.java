package lesson13;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int colRow, int colCol) {
        numbers = new double[colRow][colCol];

    }

    public Matrix(double[][] data) {
        numbers = data;

    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < this.getRows() && colIndex < this.getColumns()) {
            return numbers[rowIndex][colIndex];
        }
        System.out.println("Вы указали неверный индекс строки или колонки");
        return 0;

    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < this.getRows() && colIndex < this.getColumns()) {
            numbers[rowIndex][colIndex] = value;
            return;
        }
        System.out.println("Вы указали неверный индекс строки или колонки");
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны");
            return null;

        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы не равны");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны");
            return null;

        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы не равны");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны");
            return null;

        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы не равны");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
//        double [] column =
        for(int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++){
                numbers[i][j] = 0;
                for (int k = 0; k < getRows() && k < getColumns(); k++){
//                    numbers[i][j] += getRows()[i][k] * getColumns()[k][j];}
                }
//                for (int k = 0; k < re; j++){
//                System.out.print(numbers[i][j]);

            }

        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public boolean printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }

        return false;
    }
}




