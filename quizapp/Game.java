package com.quizapp;

import java.util.Scanner;

public class Game {

    Question[] ques = new Question[3];
    Player player = new Player();

    String[] quesData = {"Who is the Strongest Avenger?","What is the closest planet to sun?","What is the Capital of India?"};
    String[] options1 = {"Iron Man","Venus","Delhi"};
    String[] options2 = {"Spider Man","Mercury","Mumbai"};
    String[] options3 = {"Thor","Earth","Nashik"};
    String[] options4 = {"Wanda","Jupiter","Kerala"};
    int[] answers = {4,2,1};

    public void initGame()
    {
        //created 3 objects
        for (int i=0;i< ques.length;i++){
            ques[i] = new Question();
        }
        //applying values to the variables of the object
//        ques[0].question="Who is the Strongest Avenger?";
//        ques[0].op1="Iron Man";
//        ques[0].op2="Spider Man";
//        ques[0].op3="Thor";
//        ques[0].op4="Wanda";
//        ques[0].correctAns = 4;
//
//        ques[1].question="What is the closest planet to sun?";
//        ques[1].op1="Venus";
//        ques[1].op2="Mercury";
//        ques[1].op3="Earth";
//        ques[1].op4="Jupiter";
//        ques[1].correctAns = 2;
//
//        ques[2].question="What is the Capital of India?";
//        ques[2].op1="Delhi";
//        ques[2].op2="Mumbai";
//        ques[2].op3="Nashik";
//        ques[2].op4="Kerala";
//        ques[2].correctAns = 1;

        for(int i=0;i< ques.length;i++){
            ques[i].question = quesData[i];
            ques[i].op1 = options1[i];
            ques[i].op2 = options2[i];
            ques[i].op3 = options3[i];
            ques[i].op4 = options4[i];
            ques[i].correctAns = answers[i];
        }


    }
    public void play()
    {
        player.getDetails();
        for (int i=0;i< ques.length;i++){

            boolean status = ques[i].askQuestion();
            if (status==true){

                System.out.println("Amazing!!!");
                player.score++;
            }
            else {
                System.out.println("Better luck next time...");
            }
        }
        System.out.println("\n"+player.name+" your score is "+player.score);
    }
}
