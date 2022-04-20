package abstraction.abstract_classes;

public class Iphone extends Phone{

    public static final String OS = "IOS";

    public Iphone (){

    }

    public Iphone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone calls");
    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");
    }

    @Override
    public void text() {
        System.out.println("iPhone texts");
    }

    @Override
    public boolean isCovertible() {
        return true;
    }
}