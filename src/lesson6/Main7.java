package lesson6;

public class Main7 {
        public static void main(String[] args) {
            TextUtils2 tr1 = new TextUtils2();
            TextUtils2 tr2 = new TextUtils2();
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


