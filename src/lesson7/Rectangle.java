package lesson7;

public class Rectangle {
    private double lengthAB;
    private double widthBC;
    private double lengthCD;
    private double widthDA;

    public void setLengthAB(double valueLengthAB) {
        lengthAB = valueLengthAB;
    }
    public void setWidthBC(double valueWidthBC) {
        widthBC = valueWidthBC;
    }
    public void setLengthCD(double valueLengthCD) {
        lengthCD = valueLengthCD;
    }
    public void setWidthDA(double valueWidthDA) {
        widthDA = valueWidthDA;
    }

    public double perimetr() {
        double perimetr = (lengthAB + widthBC) * 2;
        return perimetr;
    }

    public double area() {
        double area = (lengthAB * widthBC);
        return area;

    }

    public void printTypeOfRectangle() {
        if (lengthAB == widthBC && lengthCD == widthDA && lengthAB == widthDA && lengthCD == widthBC) {
            System.out.println("Квадрат");
        } else if (widthBC == widthDA && lengthAB == lengthCD) {
            System.out.println("Прямоугольник");
        } else {
            System.out.println("Четырехугольник");
        }
    }
}


