package lesson12;

public class Pen {
    private String color;
    private String type;
    private int price;

    public Pen() {
    }

    public Pen(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (getPrice() != pen.getPrice()) return false;
        if (getColor() != null ? !getColor().equals(pen.getColor()) : pen.getColor() != null) return false;
        return getType() != null ? getType().equals(pen.getType()) : pen.getType() == null;
    }

    @Override
    public int hashCode() {
        int result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + getPrice();
        return result;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
