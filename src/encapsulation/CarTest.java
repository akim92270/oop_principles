package encapsulation;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();


        //Setting info for make
        car1.make = "BMW";

        //Getting info of make
        System.out.println(car1.make); //BMW

        //Setting info for year
        car1.setYear(2020);

        //Getting info of year
        System.out.println(car1.getYear());

        //car1.setPrice(5000, "Hello World"); //exception if password is incorrect
        //System.out.println(car1.getPrice()); //without setPrice the default value will be 0

        car1.setPrice(5000, "abc1234"); //exception if password is incorrect
        System.out.println(car1.getPrice());

        System.out.println(car1.getIsConvertible());
    }
}
