package com.company;

import java.util.Scanner;

class Animal implements java.io.Serializable{ // Here we use the package-private access modifier, which does not have a keyword
    // Private class attributes
    private String name;
    private String homotaxis;
    private float weight;
    private float lifeSpan;
    // Animal constructor
    Animal() {
        setName("");
        setHomotaxis("");
        setWeight(1f);
        setLifeSpan(1f);
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for homotaxis
    public void setHomotaxis(String homotaxis) {
        this.homotaxis = homotaxis;
    }
    // Getter for homotaxis
    public String getHomotaxis() { return homotaxis; }
    // Setter for weight
    public void setWeight(float weight) {
        Scanner s = new Scanner(System.in);
        while (weight <= 0) {
            System.out.println("Weight must be above 0kg. Please try again.");
            weight = s.nextFloat();
        }
        this.weight = weight;
    }
    // Getter for weight
    public float getWeight() { return weight; }
    // Setter for lifeSpan
    public void setLifeSpan(float lifeSpan) {
        Scanner s = new Scanner(System.in);
        while (lifeSpan <= 0) {
            System.out.println("Average life span must be above 0 years. Please try again.");
            lifeSpan = s.nextFloat();
        }
        this.lifeSpan = lifeSpan;
    }
    // Getter for lifeSpan
    public float getLifeSpan() { return lifeSpan; }
}