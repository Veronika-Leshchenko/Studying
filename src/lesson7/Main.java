package lesson7;

public class Main {
    // правила инкапсуляции:
    // модификатор доступа (public, private, ___, protected)
    // обязательно должен быть указан в четырех местах кода:
    // перед классом, переменной, конструктором и методом.
    // Перед переменной внутри класса ставить в 99% случаях - private
    public static void main(String[] args) {
        Bludo vinigret = new Bludo();
        Bludo acecream = new Bludo();
        vinigret.setName("Зимний салат Винегрет");
        acecream.setName("Мороженое со сливками");

//        vinigret.name = "Зимний салат Винегрет";
//        acecream.name = "Мороженое со сливками";

        System.out.println(acecream.getName());
//        System.out.println(acecream.ingridients);
    }
}
