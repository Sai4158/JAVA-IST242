package model;/*
 * Filename: Person.java
 * Short description: Represents name, height, weight, hometown, and high school.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
 */

import model.Height;

public class Person {
    // Instance Variables -- define your private data
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    // Constructors
    public Person() {
        // initialize default values
        this.name = "";
        this.height = new Height();
        this.weight = 0;
        this.hometown = "N/A";
        this.highSchool = "N/A";

    }

    // pass in data to initialize variables
    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;

    }


    // Set methods - one set method for each instance variable defined above

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }


    // Get methods - one get method for each instance variable defined above

    public String getName() {
        return name;
    }

    public Height getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHometown() {
        return hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }


    // Additional methods -- such as for calculation, display

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", height=" + height +
                ", weight=" + weight +
                ", hometown=" + hometown +
                ", highSchool=" + highSchool +
                '}';
    }

}
