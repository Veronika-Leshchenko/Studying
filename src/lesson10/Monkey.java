package lesson10;

public class Monkey extends AbstractAnimal implements ZooAnimal {
    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("YYYYYYYYYYYaaaaaaaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void printHello() {
        System.out.println("Привет, я обезьяна!");

    }
}
