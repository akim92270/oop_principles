package abstraction.abstract_classes;

public abstract class Phone {

    //default constructor
    public Phone(){

    }

    //Create a 4-arg constructor
    public Phone(String brand, String color, int storage, double price) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    public String brand;
    public String color;
    public int storage;
    public double price;

    //We can define here what every phone should do

    public abstract void call();
    public abstract void ring();
    public abstract void text();
    public abstract boolean isCovertible();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}
