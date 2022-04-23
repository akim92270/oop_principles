package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // no casting

        /*
        Up-casting
        -putting smaller data into bigger - widening
        -it happens implicitly
         */

        Animal animal1 = new Cat(); //up-casting Cat in the shape of Animal
        Object object1 = new Cat(); //up-casting Cat in the shape of Object.

        List<Animal> animalS = new ArrayList<>(); //up-casting ArrayList in the shape of List

        /*
        Down-casting
        -putting bigger data into smaller
        -happens explicitly
        BUT: There could be data loss with primitives
        There can be Exception thrown with object if done improperly
         */


    }
}
