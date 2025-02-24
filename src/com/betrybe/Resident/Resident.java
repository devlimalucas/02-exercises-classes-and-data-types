package com.betrybe.Resident;

public class Resident {
    public String name;
    public double height;
    public int age;
    public double weight;

    public Resident(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this. height = height;
    }

    public double calcBmi() {
        return this.weight / (this.height * this.height);
    }

    public boolean connectInternet(double rate) {
        return rate > 0.5;

    }
}