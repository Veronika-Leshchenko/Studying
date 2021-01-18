package lesson10;

public class Slon extends AbstractAnimal implements ZooAnimal{


    public Slon(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("ТТТТТТрррррррррррррр");
    }

    @Override
    public void jump() {
        System.out.println("Слон прыгает");

    }



    @Override
    public void printHello() {
        System.out.println("Привет, я слон!");

    }


    @Override
    public String toString() {
        return "Slon{" +
                "name='" + name + '\'' +
                '}';
    }
}
