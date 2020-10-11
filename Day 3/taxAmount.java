package com.letsupgrade;

import java.util.Scanner;

public class taxAmount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Employee Name: ");
        e.name = sc.nextLine();
        System.out.print("Enter Employee Birth-Date(1-31): ");
        e.day = sc.nextInt();
        System.out.print("Enter Employee Birth-Month(1-12): ");
        e.month = sc.nextInt();
        System.out.print("Enter Employee Birth-Year: ");
        e.year = sc.nextInt();
        System.out.print("Enter Employee Monthly Salary: ");
        e.mSalary = sc.nextInt();

        e.display();

    }

}
