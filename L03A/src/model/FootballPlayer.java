package model;
/**
 * Filename: FootballPlayer.java
 * Short description: Represents a football player with additional attributes.
 * IST 242 Assignment: L03A
 * @author Sai Rangineeni
 * @version 3/2/2024
 */

import java.util.ArrayList;
import java.util.Arrays;


public class FootballPlayer extends Person implements TableMember {
    // Instance Variables
    private int number;
    private String position;

    // Constructors
    public FootballPlayer() {
        // default values
        super();
        this.number = 0;
        this.position = "N/A";
    }

    public FootballPlayer(String name, Height height, int weight,
                          String hometown, String highSchool, int number,
                          String position)
    {
        //  values
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    // TableMember interface methods
    @Override
    public String getAttribute(int n) {
        switch (n) {
            case 0: return String.valueOf(getNumber());
            case 1: return getPosition();
            case 2: return getName();
            case 3: return getHeight().toString();
            case 4: return String.valueOf(getWeight());
            case 5: return getHometown();
            case 6: return getHighSchool();
            default: throw new IndexOutOfBoundsException("Attribute index out of bounds");
        }
    }

    @Override
    public ArrayList<String> getAttributes() {
        return new ArrayList<>(Arrays.asList(
                String.valueOf(getNumber()),
                getPosition(),
                getName(),
                getHeight().toString(),
                String.valueOf(getWeight()),
                getHometown(),
                getHighSchool()
        ));
    }

    @Override
    public String getAttributeName(int n) {
        return getAttributeNames().get(n);
    }

    @Override
    public ArrayList<String> getAttributeNames() {
        return new ArrayList<>(Arrays.asList(
                "number",
                "position",
                "name",
                "height",
                "weight",
                "hometown",
                "highSchool"
        ));
    }

    // Set methods for FootballPlayer attributes
    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Get methods for FootballPlayer attributes
    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    // Additional methods -- such as for calculation, display
    @Override
    public String toString() {
        // superclass
        return number + " " + position + " " + getName() + " " + getHeight().toString() + " " +
                getWeight() + " " + getHometown() + " " + getHighSchool();
    }
}