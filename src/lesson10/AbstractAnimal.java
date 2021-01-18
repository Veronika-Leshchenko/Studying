package lesson10;

public abstract class AbstractAnimal implements ZooAnimal {
    protected String name;

    @Override
    public void printName() {
        System.out.println(name);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractAnimal)) return false;

        AbstractAnimal that = (AbstractAnimal) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
