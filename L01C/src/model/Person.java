package model;/*
 * Filename: Person.java
 * Short description: Represents a person with a name, height, weight, hometown, and high school information.
 * IST 242 Assignment: L01C
 * @author  Sai Rangineeni
 * @version 2/10/2024
 */


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
        this.height = new Height(0,0);
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

    // Set and Get methods - one set method for each instance variable defined above

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }


    // Additional methods -- such as for calculation, display

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
