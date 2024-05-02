package model;
/*
 * Filename: Person.java
 * Short description: Represents a person with name, weight, hometown, and high school information.
 * IST 242 Assignment: L01B
 * @author  Sai Rangineeni
 * @version 2/9/2024 (updated)
 */


public class Person {
    // Instance Variables -- define your private data
    private String name;
    private int weight;
    private String hometown;
    private String highSchool;


    // Constructors
    public Person() {
        // initialize default values
        this.name = "";
        this.weight = 0;
        this.hometown = "N/A";
        this.highSchool = "N/A";
    }

    public Person(String name, int weight, String hometown, String highSchool){
        // pass in data to initialize variables
        this.name = name;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;


    }

    // Set methods - one set method for each instance variable defined above

    public void setName(String name) {
        this.name = name;
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
                ", weight=" + weight +
                ", hometown=" + hometown +
                ", highSchool=" + highSchool +
                "}";
    }

}
