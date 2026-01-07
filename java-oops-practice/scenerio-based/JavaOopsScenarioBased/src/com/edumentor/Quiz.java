package com.edumentor;

class Quiz {
    private String[] questions;      // internal question bank protected
    private final String[] answers;  // cannot be modified once set
    private int score;
    private int difficultyLevel;

    // Constructor with difficulty
    public Quiz(String[] questions, String[] answers, int difficultyLevel) {
        this.questions = questions;
        this.answers = answers;
        this.difficultyLevel = difficultyLevel;
        this.score = 0;
    }

    // Operator usage for scoring
    public void submitAnswers(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score += 10 * difficultyLevel;
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / (answers.length * 10 * difficultyLevel);
    }
}

