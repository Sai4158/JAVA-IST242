package Model;

/**
 * Filename: Height.java
 * Short description: Represents the height of a person in feet and inches.
 * IST 242 Assignment: L03B
 * @version 3/15/2024
 */
public class Height {
    private int feet;
    private int inches;

    // Constructors
    public Height() {
        // Initialize with default values
        this.feet = 0;
        this.inches = 0;
    }

    public Height(int feet, int inches) {
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

    // Additional methods
    @Override
    public String toString() {
        return feet + "' " + inches + "\"";
    }
}
