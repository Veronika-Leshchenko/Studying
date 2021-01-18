package lesson6;

public class TextUtils2 {
    private double sideAB;
    private double sideBC;
    private double sideCA;

    public void setSideAB(double valueSaidAB) {
        sideAB = valueSaidAB;
    }

    public void setSideBC(double valueSaidBC) {
        sideBC = valueSaidBC;
    }

    public void setSideCA(double valueSaidCA) {
        sideCA = valueSaidCA;
    }
    public double perimetr() {
        double perimetr = sideAB + sideBC + sideCA;
        return perimetr;

    }

    public double area() {
        double halfPerimetr = this.perimetr() / 2;
        double area = Math.sqrt(this.perimetr() / 2 *
                (halfPerimetr - sideAB) * (halfPerimetr - sideBC) * (halfPerimetr - sideCA));
        return area;

    }

    public void printTypeOfTriangle() {
        if (sideAB == sideBC && sideCA == sideAB) {
            System.out.println("Равносторонний треугольник");

        } else if (sideAB != sideBC && sideBC != sideCA && sideAB != sideCA) {
            System.out.println("Разносторонний треугольник");

        } else {
            System.out.println("Равнобедренный треугольник");
        }
    }
}
