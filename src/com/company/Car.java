package com.company;

public class Car {
    String car_name;
    String car_modal;
    Integer car_price;

    public Car(){}

    public Car(String car_name, String car_modal, Integer car_price) {
        this.car_name = car_name;
        this.car_modal = car_modal;
        this.car_price = car_price;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_modal() {
        return car_modal;
    }

    public void setCar_modal(String car_modal) {
        this.car_modal = car_modal;
    }

    public Integer getCar_price() {
        return car_price;
    }

    public void setCar_price(Integer car_price) {
        this.car_price = car_price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_name='" + car_name + '\'' +
                ", car_modal='" + car_modal + '\'' +
                ", car_price=" + car_price +
                '}';
    }
}
