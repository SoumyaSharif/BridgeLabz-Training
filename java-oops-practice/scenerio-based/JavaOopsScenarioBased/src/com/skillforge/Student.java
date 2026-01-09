package com.skillforge;

public class Student extends User implements ICertifiable {

    private int progress;   // percentage
    private int score;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.score = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    public void assignScore(int score) {
        this.score = score;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100 && score >= 60) {
            System.out.println("Certificate Generated for " + name);
        } else {
            System.out.println("Not eligible for certificate.");
        }
    }
}
