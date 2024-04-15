package org.example.entity;

public class Guest {
    String email;

    public Guest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "email='" + email + '\'' +
                '}';
    }
}
