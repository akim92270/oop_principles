package polymorphism;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("\n-----Cat Object--------\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");


        System.out.println("\n-----Dog Object--------\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("\n-----Animal Object--------\n");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat("some food"); // Animal eats some food
        animal1.sleep();

        System.out.println("\n-----Cat and Dog Objects in Animal Shape--------\n");
        /*Create a Cat and Dog object in the shape of Animal
        Invoke their eat() and sleep() method which are zero arg
         */
        Animal animal2 = new Cat();
        animal2.eat(); //Cat eats
        animal2.sleep(); //Cat sleeps

        Animal animal3 = new Dog();
        animal2.eat();
        animal2.sleep();

        //Animal, Cat, Dog
        Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}
