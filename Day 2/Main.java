package com.letsupgrade;

public class Main {

    public static void main(String[] args) {

        Employee e1 =  new Employee();
        Employee e2 =  new Employee();

        e1.name = "Raj Kaste";
        e1.age = 21;
        e1.city = "Pune";

        e2.name = "Ankit Sharma";
        e2.age = 22;
        e2.city = "Pimpri";


        e1.displayDetails();
        e2.displayDetails();

    }
}
