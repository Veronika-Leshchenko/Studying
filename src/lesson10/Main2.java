package lesson10;

public class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3.5, 3.5, 4);

        Figura[] figurs = new Figura[3];
        figurs[0] = circle;
        figurs[1] = square;
        figurs[2] = triangle;


        for (Figura figura : figurs) {
            figura.calcArea();
            figura.calcPerimeter();
        }

    }
}

