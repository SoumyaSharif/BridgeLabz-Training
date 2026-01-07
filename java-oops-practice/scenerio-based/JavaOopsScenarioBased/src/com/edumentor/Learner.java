package com.edumentor;

class Learner extends User implements ICertifiable {
    private boolean isFullTime;

    public Learner(String name, String email, boolean isFullTime) {
        super(name, email);
        this.isFullTime = isFullTime;
    }

    @Override
    public void generateCertificate() {
        if (isFullTime)
            System.out.println("Full-Time Course Certificate Generated 🎓");
        else
            System.out.println("Short Course Certificate Generated 📜");
    }
}


