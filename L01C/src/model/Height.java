package model;/*
 * Filename: Height.java
 * Short description: Represents height with feet and inches.
 * IST 242 Assignment: L01C
 * @author  Sai Rangineeni
 * @version 2/10/2024
 */


public class Height {
    // Instance Variables -- define your private data
    private int feet;
    private int inches;


    // Constructors
    public Height() {
        this.feet = 0;
        this.inches = 0;

    }

    // All-parameter constructor
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Set and get methods

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    // Method to return a formatted height string as "5'2\""
    @Override
    public String toString() {
        return feet + "'" + inches + "\"";
    }
}


