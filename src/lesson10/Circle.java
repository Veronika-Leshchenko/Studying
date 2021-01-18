package lesson10;

public class Circle implements Figura {
    protected double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void calcArea() {
        String result = String.format("%.2f", Math.PI * (r * r));

        System.out.println("Площадь круга" + " " + result);

    }

    @Override
    public void calcPerimeter() {
        String result = String.format("%.2f", Math.PI * (2 * r));

        System.out.println("Периметр круга" + " " + result);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}

