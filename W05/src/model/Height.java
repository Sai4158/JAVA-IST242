package model;/*
 * Filename: Height.java
 * Short description: Encapsulates the height attribute of a Person.
 * IST 242 Assignment: W05: L01D
 * @author  Sai Rangineeni
 * @version 2/15/2024
 */

public class Height {
    // Instance Variables -- define your private data
    private int feet;
    private int inches;

    // Constructors
    public Height() {
        // initialize default values
        this.feet = 0;
        this.inches = 0;
    }

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Set methods - one set method for each instance variable defined above
    //             - purpose is to pass in a value stored in the private variable

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    // Get methods - one get method for each instance variable defined above
    //             - purpose is to return the value stored in the private variable

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    // Additional methods -- such as for calculation, display

    @Override
    public String toString() {
        return feet + "'" + inches + "\"";
    }

}
