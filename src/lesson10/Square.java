package lesson10;

public class Square implements Figura {
    protected double squareSide;
    public Square(double squareSide) {
        this.squareSide = squareSide;

    }

    @Override
    public void calcArea() {
        String result = String.format("%.2f", squareSide * squareSide);

        System.out.println("Площадь квадрата" + " " + result);
    }

    @Override
    public void calcPerimeter() {
        String result = String.format("%.2f", squareSide * 4);

        System.out.println("Периметр квадрата" + " " + result);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.squareSide, squareSide) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(squareSide);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareSide=" + squareSide +
                '}';
    }
}
