package lesson7;

public class Ellipse {
    private double lengthMajorSemiAxisA;
    private double lengthMinorSemiAxisB;

    public void setLengthMajorSemiAxisA(double valueLengthMajorSemiAxisA) {
        lengthMajorSemiAxisA = valueLengthMajorSemiAxisA;
    }

    public void setLengthMinorSemiAxisB(double valueLengthMinorSemiAxisB) {
        lengthMinorSemiAxisB = valueLengthMinorSemiAxisB;
    }

    public double perimetrOfaEllipse() {
        double perimetr = 4 * (Math.PI * lengthMajorSemiAxisA * lengthMinorSemiAxisB +
                Math.pow((lengthMajorSemiAxisA - lengthMinorSemiAxisB), 2));
        return perimetr;

    }

    public double areaOfaEllipse() {
        double area = (Math.PI * lengthMajorSemiAxisA * lengthMinorSemiAxisB);
        return area;

    }
}
