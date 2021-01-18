package lesson8;

public class Book {
    private String name; // поля класса все всегда объявляются как private
    private String avtor; // поля класса все всегда объявляются как private
    private String izdanie; // поля класса все всегда объявляются как private
    private int price; // поля класса все всегда объявляются как private
    private int salesProsent; // поля класса все всегда объявляются как private

    // формула создания конструктора
    // 1- модификатор доступа (в основном всегда public)
    // 2 - название конструктора (полностью совпадает с названием класса)
    // 3 - входящие параметры
    // 4 - тело самого конструктора
    public  Book() {

    }
    public Book(String name, String avtor) {
        this.name = name;
        this.avtor = avtor;


    }
    public Book(String name, String avtor, String izdanie, int price, int salesProsent) {
        this.name = name;
        this.avtor = avtor;
        this.izdanie = izdanie;
        this.price = price;
        this.salesProsent = salesProsent;
    }

    public Book(String name, int price, int salesProsent) {
        this.name = name;
        this.price = price;
        this.salesProsent = salesProsent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getIzdanie() {
        return izdanie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalesProsent() {
        return salesProsent;
    }

    public void setSalesProsent(int salesProsent) {
        this.salesProsent = salesProsent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // если один объект, тоесть первая книга (под ним слово this == второй объект это под ссылкой о) лежит там же, где вторая книга, то вернут true
        if (!(o instanceof Book)) return false; // instanceof это вопрос, который говорит. А объект о он является объектом класса book?

        Book book = (Book) o;

        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (avtor != null ? !avtor.equals(book.avtor) : book.avtor != null) return false;
        return izdanie != null ? izdanie.equals(book.izdanie) : book.izdanie == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        result = 31 * result + (izdanie != null ? izdanie.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", avtor ='" + avtor + '\'' +
                ", izdanie ='" + izdanie + '\'' +
                ", price =" + price +
                ", salesProsent =" + salesProsent +
                '}';
    }


}
