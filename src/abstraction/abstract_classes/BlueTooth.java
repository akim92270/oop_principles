package abstraction.abstract_classes;

public interface BlueTooth {
    void connectBlueTooth();

    //Methods that has body - later versions of Java

    //static method
    static int getYear(){
        return 2022;
    }

    //Default Method (non-static method that has body)
    default boolean isConnected(){
        return true;
    }
}
