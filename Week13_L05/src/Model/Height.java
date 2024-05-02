package Model;
/**
 * Filename: Height.java
 * Short description: Height in feet and inches for a person
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

public class Height {
    private int feet;
    private int inches;

    //Constructor
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
        return feet + "'" + inches + "\"";
    }
}
