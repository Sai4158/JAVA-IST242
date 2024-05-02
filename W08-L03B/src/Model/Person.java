package Model;

/**
 * Filename: Person.java
 * Short description: Represents a person with attributes like name and height.
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */
public class Person {
    // Instance Variables
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    // Constructors
    public Person() {
        // Initialize default values to prevent NullPointerException
        this.name = "";
        this.height = new Height(); // Assuming Height has a default constructor
        this.weight = 0;
        this.hometown = "";
        this.highSchool = "";
    }

    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    // Set methods
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

    // Get methods
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

    // Additional methods
    @Override
    public String toString() {
        return name + " " + height.toString() + " " + weight + " " + hometown + " " + highSchool;
    }
}
