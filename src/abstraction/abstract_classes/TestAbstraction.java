package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have as below
        Samsung
        Black
        64
        700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700.0);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100.0);
        Iphone i1 = new Iphone("iPhone", "Silver", 128, 1000.0);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
        Print all objects
        Find and print the most expensive one with the message -> "The most expensive phone is = iPhone"
        Find and print how many phones are convertible -> 2
         */

        int count = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;

        for (Phone phone : phones) {
            System.out.println(phone);
            if(phone.isCovertible()) count++;
            if(phone.price > max) mostExpensivePhone = phone;
        }
        System.out.println(count);
        System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());

        System.out.println(Iphone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }
    }
}
