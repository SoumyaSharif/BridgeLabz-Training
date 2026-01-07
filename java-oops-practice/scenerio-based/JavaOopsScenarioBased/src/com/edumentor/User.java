package com.edumentor;

abstract class User {
    protected String name;
    protected String email;
    protected final int userId; // cannot be changed once assigned

    private static int idCounter = 1000;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.userId = ++idCounter;
    }
}

