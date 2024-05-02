package Model;

/**
 * Filename: Person.java
 * Short description: Represents a person with name and height
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

public class Person {
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    // No-parameter constructor
    public Person() {

    }

    // All parameter constructor
    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    // Getters and setters

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
