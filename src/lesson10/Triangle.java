package lesson10;

public class Triangle implements Figura {
    protected double sideAB;
    protected double sideBC;
    protected double sideCA;
    public Triangle(double sideAB, double sideBC, double sideCA) {

        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCA = sideCA;
    }

    @Override
    public void calcArea() {
        double p = (sideAB + sideBC + sideCA) / 2;
        String result = String.format("%.2f", Math.sqrt(p * (p - sideAB) * (p - sideBC) * (p - sideCA)));

        System.out.println("Площадь треугольника" + " " + result);
    }

    @Override
    public void calcPerimeter() {
        String result = String.format("%.2f", sideAB + sideBC + sideCA);

        System.out.println("Периметр треугольника" + " " + result);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideAB, sideAB) != 0) return false;
        if (Double.compare(triangle.sideBC, sideBC) != 0) return false;
        return Double.compare(triangle.sideCA, sideCA) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideAB);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideBC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideCA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideCA=" + sideCA +
                '}';
    }
}
