package com.company;

public class School {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    public School(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
