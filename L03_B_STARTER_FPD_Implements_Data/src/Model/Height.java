package Model;

/**
 * Filename: Height.java
 * Short description: Represents the height of a person in feet and inches
 * IST 242 Assignment: L03B
 * @version 3/15/2024
 */

public class Height {
    private int feet;
    private int inches;

    // No parameter constructor
    public Height() {

    }

    // All parameter constructor
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Getters and setters
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

    @Override
    public String toString() {
        // Return the height
        return feet + "'" + inches + "\"";
    }
}
