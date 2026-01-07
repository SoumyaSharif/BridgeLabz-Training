package com.edumentor;

public class EduMentorApp {
    public static void main(String[] args) {
        Learner learner = new Learner("Soumya", "soumyasharif@gmail.com", true);

        String[] questions = {"Java is OOP?", "Interface supports multiple inheritance?"};
        String[] answers = {"Yes", "Yes"};

        Quiz quiz = new Quiz(questions, answers, 2);
        quiz.submitAnswers(new String[]{"Yes", "Yes"});

        System.out.println("Score Percentage: " + quiz.getPercentage());
        learner.generateCertificate(); // polymorphism
    }
}

