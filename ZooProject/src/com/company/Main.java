package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            ArrayList<ZooAnimal> objAnimals = new ArrayList<>();
            System.out.println("To view all animals in the zoo, press 1. \n To add new animal to the zoo, press 2. \n To find an animal via name, press 3. \n To find an animal via code, press 4. \n To manage animal via code, press 5. \n To delete an animal via code, press 6. \n To exit the zoo, press 7. \n");
            int n;
            float f;
            String str;
            boolean flag;
            do {
                n = s.nextInt();
            } while ((n <= 0) | (n > 7));
            while (n != 7) {
                switch (n) {
                    case 1:
                        if (objAnimals.isEmpty()) {
                            System.out.println("The zoo is empty.");
                        } else {
                            for (ZooAnimal i : objAnimals) {
                                System.out.println(i.getName());
                            }
                        }
                        break;
                    case 2:
                        ZooAnimal a = new ZooAnimal();
                        System.out.println("Give animal code.");
                        str = s.next();
                        a.setCode(str);
                        System.out.println("Give animal name.");
                        str = s.next();
                        a.setName(str);
                        System.out.println("Give animal homotaxis.");
                        str = s.next();
                        a.setHomotaxis(str);
                        System.out.println("Give animal average weight in kilograms.");
                        f = s.nextFloat();
                        a.setWeight(f);
                        System.out.println("Give animal average life span in years.");
                        f = s.nextFloat();
                        a.setLifeSpan(f);
                        System.out.println("Give number of animals of this kind kept in the zoo.");
                        n = s.nextInt();
                        a.setNumOfAnimals(n);
                        objAnimals.add(a);
                        break;
                    case 3:
                        System.out.println("Give desired animal name.");
                        str = s.next();
                        flag = false;
                        for (ZooAnimal i : objAnimals) {
                            if (str.equals(i.getName())) {
                                System.out.println("Animal has been found.");
                                System.out.println("Animal code is: " + i.getCode());
                                System.out.println("Animal homotaxis is: " + i.getHomotaxis());
                                System.out.println("Animal average weight is: " + i.getWeight() + " kg");
                                System.out.println("Animal average life span is: " + i.getLifeSpan() + " years");
                                System.out.println("Number of animals of this kind currently in the zoo is: " + i.getNumOfAnimals());
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Sorry, animal with given name does not exist in the zoo.");
                        }
                        break;
                    case 4:
                        System.out.println("Give desired animal code.");
                        str = s.next();
                        flag = false;
                        for (ZooAnimal i : objAnimals) {
                            if (str.equals(i.getCode())) {
                                System.out.println("Animal has been found.");
                                System.out.println("Animal name is: " + i.getName());
                                System.out.println("Animal homotaxis is: " + i.getHomotaxis());
                                System.out.println("Animal average weight is: " + i.getWeight() + " kg");
                                System.out.println("Animal average life span is: " + i.getLifeSpan() + " years");
                                System.out.println("Number of animals of this kind currently in the zoo is: " + i.getNumOfAnimals());
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Sorry, animal with given code does not exist in the zoo.");
                        }
                        break;
                    case 5:
                        System.out.println("Give desired animal code.");
                        str = s.next();
                        flag = false;
                        for (ZooAnimal i : objAnimals) {
                            if (str.equals(i.getCode())) {
                                System.out.println("Animal has been found.");
                                System.out.println("Give animal new name.");
                                str = s.next();
                                i.setName(str);
                                System.out.println("Give animal new homotaxis.");
                                str = s.next();
                                i.setHomotaxis(str);
                                System.out.println("Give animal new average weight in kilograms.");
                                f = s.nextFloat();
                                i.setWeight(f);
                                System.out.println("Give animal new average life span in years.");
                                f = s.nextFloat();
                                i.setLifeSpan(f);
                                System.out.println("Give number of animals of this kind kept in the zoo.");
                                n = s.nextInt();
                                i.setNumOfAnimals(n);
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Sorry, animal with given code does not exist in the zoo.");
                        }
                        break;
                    default:
                        System.out.println("Give desired animal code.");
                        str = s.next();
                        flag = false;
                        for (ZooAnimal i : objAnimals) {
                            if (str.equals(i.getCode())) {
                                System.out.println("Animal has been found and is being removed.");
                                objAnimals.remove(i);
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Sorry, animal with given code does not exist in the zoo.");
                        }
                }
                System.out.println("To view all animals in the zoo, press 1 \n To add new animal to the zoo, press 2 \n To find an animal via name, press 3 \n To find an animal via code, press 4 \n To manage animal via code, press 5 \n To delete an animal via code, press 6 \n To exit the zoo, press 7");
                do {
                    n = s.nextInt();
                } while ((n <= 0) | (n > 7));
            }
            System.out.println("Goodbye! We hope that you enjoyed your stay and that you visit again soon!");
            // Serialization
            String filename = "file.ser"; // File in which serialized object is located
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(objAnimals); // Method for serialization of object
            out.close();
            file.close();
            System.out.println("List of zoo animals has been saved.");
        }
        catch(IOException | InputMismatchException ex) {
            System.out.println("Sorry, the list of zoo animals could not be further processed and/or saved, likely due to an input error.");
        }
    }
}