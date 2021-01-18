package lesson6;

public class AreaTriangle {

    public static double getAreaTriangle(double sideAB, double sideBC, double sideCA) {
        double p = (sideAB + sideBC + sideCA) / 2;
        double areaTriangle = Math.sqrt(p * (p - sideAB) * (p - sideBC) * (p - sideCA));

        return areaTriangle;
    }
}
