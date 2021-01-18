package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Rectangle ra1 = new Rectangle();
        Rectangle ra2 = new Rectangle();

        ra1.setLengthAB(5.5);
        ra1.setWidthBC(10.5);
        ra1.setLengthCD(5.5);
        ra1.setWidthDA(10.5);

        ra2.setLengthAB(4.5);
        ra2.setWidthBC(4.5);
        ra2.setLengthCD(4.5);
        ra2.setWidthDA(4.5);

        ra1.printTypeOfRectangle();

        double resultArea1 = ra1.area();
        System.out.print("Площадь " + resultArea1 + "," + " ");
        double resultPerimetr1 = ra1.perimetr();
        System.out.print("Периметр " + resultPerimetr1 + "\n");

        ra2.printTypeOfRectangle();
        double resultArea2 = ra2.area();
        System.out.print("Площадь " + resultArea2 + "," + " ");
        double resultPerimetr2 = ra2.perimetr();
        System.out.print("Периметр " + resultPerimetr2 + "\n");

    }
}
