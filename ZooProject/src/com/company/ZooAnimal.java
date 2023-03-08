package com.company;

import java.util.Scanner;

// Classes Animal and ZooAnimal are two different classes, since animals don't have codes unless given to them by zoo
class ZooAnimal extends Animal implements java.io.Serializable{ // Here we use the package-private access modifier, which does not have a keyword
    // Private class attributes
    private String code;
    private int numOfAnimals;
    // ZooAnimal constructor
    ZooAnimal() { // Calls mother class constructor for the rest of animal attributes
        super();
        setCode("");
        setNumOfAnimals(1);
    }
    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }
    // Getter for code
    public String getCode() {
        return code;
    }
    // Setter for numOfAnimals
    public void setNumOfAnimals(int numOfAnimals) {
        Scanner s = new Scanner(System.in);
        while (numOfAnimals <= 0) {
            System.out.println("Number of animals of this kind currently in the zoo must be above 0. Please try again.");
            numOfAnimals = s.nextInt();
        }
        this.numOfAnimals = numOfAnimals;
    }
    // Getter for numOfAnimals
    public int getNumOfAnimals() {
        return numOfAnimals;
    }
}