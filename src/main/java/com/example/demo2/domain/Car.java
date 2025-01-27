package com.example.demo2.domain;

public class Car {

    private int speed;
    private String name;


        public Car() {
            this.setSpeed(100);
            this.setName("ベンツ");
        }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
