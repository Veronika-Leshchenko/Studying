package lesson10;

public class Main {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("Макака-1");
        Monkey monkey2 = new Monkey("Макака-2");
        Slon slon1 = new Slon("Вася");
        Slon slon2 = new Slon("Петя");

        AbstractAnimal[] animals = new AbstractAnimal[4];
        animals[0] = slon1;
        animals[1] = slon2;
        animals[2] = monkey1;
        animals[3] = monkey2;

        for (AbstractAnimal animal: animals) {
            animal.voice(); // проявление полиморфизма
        }

    }
}
