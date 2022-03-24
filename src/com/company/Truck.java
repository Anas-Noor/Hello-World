package com.company;

public class Truck {
    String t_name;

    public Truck(String t_name) {
        this.t_name = t_name;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "t_name='" + t_name + '\'' +
                '}';
    }
}
