package com.letsupgrade;

public class Employee {

    String name;
    int day,month,year;
    double mSalary,aSalary,taxAmount;

    public void display(){

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee DOB: " + day + "-" + month + "-" + year);
        System.out.println("Age: " + (2020-year));
        aSalary = mSalary * 12;
        System.out.println("Annual Salary: " + aSalary);

        if (aSalary>=500000) {
            taxAmount = aSalary * 0.2;
            System.out.println("Tax Amount: " + taxAmount); //20% tax
        }
        else if(aSalary>=400000 && aSalary <500000){
            taxAmount = aSalary * 0.15;
            System.out.println("Tax Amount: " + taxAmount); //15% tax
        }
        else if(aSalary>=300000 && aSalary <400000){
            taxAmount = aSalary * 0.1;
            System.out.println("Tax Amount: " + taxAmount); //10% tax
        }
        else if(aSalary>=200000 && aSalary <300000){
            taxAmount = aSalary * 0.05;
            System.out.println("Tax Amount: " + taxAmount); //5% tax
        }
        else if(aSalary<200000){
            System.out.println("Salary is less than 2 lacs.");
        }

    }
}
