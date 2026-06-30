package com.week2.junit;

public class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isValidAge(int age) {
        return age >= 18;
    }
}
