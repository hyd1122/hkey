package com05jdbc.entity;

public class Book {
    private String userId;
    private String username;
    private String ustayus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstayus() {
        return ustayus;
    }

    public void setUstayus(String ustayus) {
        this.ustayus = ustayus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustayus='" + ustayus + '\'' +
                '}';
    }
}
