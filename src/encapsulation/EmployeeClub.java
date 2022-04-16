package encapsulation;

import java.util.Scanner;

public class EmployeeClub {

    /*
    Write a program that asks an employee to enter their information age, address,
    and fullName

    Test Data:
    Fullname = Alex Robert
    address = 1234 Abc St, Chicago IL 12345
    age = 32

    Print "Alex Robert is in the club" if user is from Chicago and age is more than
    21
    Print "Alex Robert is not in the club" otherwise

    Expected Output:
    Alex Robert is in the club
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();


        System.out.println("Hey, what is your name?");
        emp.setFullName(scan.nextLine());


        System.out.println("And, the age please");
        emp.setAge(scan.nextInt());

        scan.nextLine();

        System.out.println("Lastly, address please");
        emp.setAddress(scan.nextLine());

        System.out.println(emp);

        if(emp.getAddress().toLowerCase().contains("chicago") && emp.getAge() > 21){
            System.out.println(emp.getFullName() + " is in the club");
        }else
            System.out.println(emp.getFullName() + " is not in the club");
    }
}
