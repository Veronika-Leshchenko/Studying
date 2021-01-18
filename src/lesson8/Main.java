package lesson8;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Кто убил Оливию Коллинз?", "Джо Спейн"); // после слова new всегда вызывается метод (конструктор)
        Book book2 = new Book("Я уйду с рассветом", "Меган Холлоуэй", "Аркадия", 624, 40);

        System.out.println(book1.equals(book2));
        System.out.println(book1.toString());


    }
}
