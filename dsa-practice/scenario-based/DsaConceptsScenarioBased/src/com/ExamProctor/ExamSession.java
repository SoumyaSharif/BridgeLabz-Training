package com.ExamProctor;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExamSession {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> answers;
    private HashMap<Integer, String> correctAnswers;

    public ExamSession() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
        correctAnswers = new HashMap<>();

        // Correct answers
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    // Track question navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store answer
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
    }

    // Function to calculate score
    public int calculateScore() {
        int score = 0;

        for (Map.Entry<Integer, String> entry : correctAnswers.entrySet()) {
            int qId = entry.getKey();
            String correct = entry.getValue();

            if (answers.containsKey(qId) && answers.get(qId).equals(correct)) {
                score++;
            }
        }
        return score;
    }

    // Review navigation history
    public void reviewNavigation() {
        System.out.println("\nQuestion Navigation (Last Visited First):");
        while (!navigationStack.isEmpty()) {
            System.out.println("Question " + navigationStack.pop());
        }
    }
}
