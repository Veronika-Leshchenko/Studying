package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle();

        tr1.setSideAB(10);
        tr1.setSideBC(5);
        tr1.setSideCA(10);

        tr2.setSideAB(20);
        tr2.setSideBC(10);
        tr2.setSideCA(20);

        double result1 = tr2.area();
        System.out.println(result1);

        tr1.printTypeOfTriangle();
    }
}
