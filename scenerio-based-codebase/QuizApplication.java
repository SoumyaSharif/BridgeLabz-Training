/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

//question1. Who died in Marvel's Avengers Endgame? Iron Man
//question2.Who is sister to Gamora? Nebula
//question3.Who is the winter soldier? Bucky Barnes
//question4.What infinity Stone does dr.strange has?
//question5.What is the name of thor's hammer? mjohnier

import java.util.*;

public class QuizApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score =0;
        System.out.println(" MARVEL QUIZ ");

        String[] questions = {"question1. Who died in Marvel's Avengers Endgame? " , "question2.Who is sister to Gamora?" , "question3.Who is the winter soldier?" , "question4.What infinity Stone does dr.strange has?" , "question5.What is the name of thor's hammer?"};
   
        System.out.println("\nQuiz Started! Choose the correct option");
        for(int i=1 ; i<=5 ; i++){
           
            System.out.println(questions[i-1]);
            
            if(i==1){
            System.out.println("\nA.Iron Man\nB.Hulk\nC. Spiderman\nD.Captain America ");
            }
            else if(i==2){
            System.out.println("\nA.Natasha\nB.Captain Marvel\nC.Nebula\nD.Shuri");
            }
            else if(i==3){
            System.out.println("\nA.Steve Rogers\nB.Bucky Barnes\nC.Tony Stark\nD.Agent Fury");
            }
            else if(i==4){
            System.out.println("\nA.Soul Stone\nB.Time Stone\nC.Power Stone\nD.Reality Stone");
            }
            else if(i==5){
            System.out.println("\nA.Jordan\nB.Storm Breaker\nC.Heimdell\nD.Mhojnier");
            }

            System.out.println("\nGive your answer : ");
            String input = sc.next();
            
            //Checking answers
            switch(questions[i-1]){

                case("question1. Who died in Marvel's Avengers Endgame? Select A , B , C , D "): {
                    if(input.equals("A")){
                        score++ ;
                    }
                }

                case("question2.Who is sister to Gamora?"):{
                    if(input.equals("C")){
                        score++ ;
                    }
                }

                case("question3.Who is the winter soldier?"):{
                    if(input.equals("B")){
                        score++ ;
                    }
                }

                case("question4.What infinity Stone does dr.strange has?"):{
                    if(input.equals("B")){
                        score++ ;
                    }
                }

                case("question5.What is the name of thor's hammer?"):{
                    if(input.equals("D")){
                        score++ ;
                    }
                }


            }

        }

        System.out.println("Your Score is: " + score);
    }
    
    
}
