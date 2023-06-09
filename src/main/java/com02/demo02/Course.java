package com02.demo02;

public class Course {
    private String cname;
    private int cage;

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                ", cage=" + cage +
                '}';
    }
}
