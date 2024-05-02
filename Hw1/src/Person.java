/*
 * Filename: Person.java
 * Short description: Defines the Person class with methods
 * IST 242 Assignment: M02 - W02: L01A Assignment - Objects and Classes
 * @author  Sai Rangineeni
 * @version 1/28/2024
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
        name = "";
        weight = 0;
        hometown = "N/A";
        highSchool = "N/A";
    }

    // pass in data to initialize variables
    public Person(String name, int weight, String hometown, String highSchool){
        this.name = name;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    // Set methods - one set method for each instance variable defined above
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setHometown(String hometown){
        this.hometown = hometown;
    }
    public void setHighSchool(String highSchool){
        this.highSchool = highSchool;
    }

    // Get methods - one get method for each instance variable defined above
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public String getHometown(){
        return hometown;
    }
    public String getHighSchool(){
        return highSchool;
    }

    // Additional methods -- such as for calculation, display

    public String toString() {
        return "Person{name=" +name+
                ", weight=" +weight+
                ", hometown=" +hometown+
                ", highSchool=" +highSchool+
                "}";
    }

}
