package com.letsupgrade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int phy, chem, comp,  maths, eng;
        double total,percentage;

        System.out.println("\n*****Enter Marks out of 100*****");
        System.out.print("Enter Physics marks: ");
        phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        chem = sc.nextInt();
        System.out.print("Enter Computer marks: ");
        comp = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        maths = sc.nextInt();
        System.out.print("Enter English marks: ");
        eng = sc.nextInt();

        total = phy + chem + comp + maths + eng;
        percentage = (total / 500.0) * 100;

        System.out.println("\nPercentage = " + percentage);

        if(percentage >80){
            System.out.println("Your Grade is: A");
        }
        else if(percentage >70 && percentage <=80){
            System.out.println("Your Grade is: B");
        }
        else if(percentage >60 && percentage <=70){
            System.out.println("Your Grade is: C");
        }
        else if(percentage >50 && percentage <=60){
            System.out.println("Your Grade is: D");
        }
        else if(percentage >=40 && percentage <=50){
            System.out.println("Your Grade is: E");
        }
        else{
            System.out.println("Your Grade is: F");
        }

    }
}
