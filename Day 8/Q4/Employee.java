package Day8.Q4;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    String name,designation;
    int age;
    float salary;

    public void getDetails(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter designation: ");
        designation = sc.nextLine();
        System.out.println("Enter salary: ");
        salary = sc.nextFloat();

    }

    public void displayDetails(){

        System.out.println("Name: "+name+"\nAge: "+age+"\nDesignation: "+designation+"\nSalary: "+salary);

    }
}
