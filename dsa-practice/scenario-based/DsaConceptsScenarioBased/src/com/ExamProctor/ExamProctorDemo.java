package com.ExamProctor;
public class ExamProctorDemo {

    public static void main(String[] args) {

        ExamSession exam = new ExamSession();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        int score = exam.calculateScore();
        System.out.println("\nFinal Score: " + score);

        exam.reviewNavigation();
    }
}
