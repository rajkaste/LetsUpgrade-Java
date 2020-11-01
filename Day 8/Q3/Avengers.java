package Day8.Q3;

import java.util.Scanner;

public class Avengers {
    Scanner sc = new Scanner(System.in);

    String name,power,weapon,planet;
    int age;

    public void getDetails(){

        System.out.print("Avenger Name: ");
        name = sc.nextLine();
        System.out.print("Enter the Power: ");
        power = sc.nextLine();
        System.out.print("Enter the Weapon: ");
        weapon = sc.nextLine();
        System.out.print("Enter the Planet/Realm: ");
        planet = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();

    }

    public void displayDetails(){

        System.out.println("Avenger: "+name);
        System.out.println("Power: "+power);
        System.out.println("Weapon: "+weapon);
        System.out.println("Age: "+age);
        System.out.println("Planet: "+planet);

    }
}
