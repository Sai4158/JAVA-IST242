package model;/*
 * Filename: Height.java
 * Short description: The height in feet and inches for a person.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
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

    public Height(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }

    // Set methods

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    // Get methods

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
