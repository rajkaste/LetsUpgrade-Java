package com.quizapp;

import java.util.Scanner;

public class Question {
    Scanner sc = new Scanner(System.in);

    String question,op1,op2,op3,op4;
    int userAns,correctAns;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+op1);
        System.out.println("2. "+op2);
        System.out.println("3. "+op3);
        System.out.println("4. "+op4);
        System.out.println("choose an option(1/2/3/4)...");
        userAns = sc.nextInt();
        if(userAns==correctAns) {
            return true;
        }
        return false;
    }

}
