package encapsulation;

public class Car {

    //instance variables
    public String make;
    private int year; //I don't have direct access, but I have indirect access
    private double price; //require a password
    private boolean isConvertible = true; //without setMethod they cannot change true to false


    //Providing indirect access to year to set and get info
    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    //Writing- setting info
    public void setPrice(double price, String adminPassword){
        this.price = price;
        if(adminPassword.equals("abc1234")) this.price = price;
        else throw new RuntimeException("The password entered is not valid");
    }

    //Reading = getting info
    public double getPrice(){
        return this.price;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }
}
