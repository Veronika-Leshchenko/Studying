package lesson7;

public class Main3 {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse();

        ellipse.setLengthMajorSemiAxisA(5.5);
        ellipse.setLengthMinorSemiAxisB(10.5);

        double resultArea1 = ellipse.areaOfaEllipse();
        System.out.print("Площадь эллипса " + resultArea1 + "," + " ");
        double resultPerimetr1 = ellipse.perimetrOfaEllipse();
        System.out.print("Периметр эллипса " + resultPerimetr1 + "\n");

    }
}

