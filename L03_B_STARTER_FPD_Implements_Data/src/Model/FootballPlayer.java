package Model;

/**
 * Filename: FootballPlayer.java
 * Short description: Represents a football player with number and position
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {
    private int number;
    private String position;

    // No parameter constructor
    public FootballPlayer() {
        super(); // Call Person constructor
    }

    // All-parameter constructor
    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    // Getters and setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Implementation of TableMember methods
    @Override
    public ArrayList<String> getAttributeNames() {
        ArrayList<String> attributeNames = new ArrayList<>();
        attributeNames.add("number");
        attributeNames.add("position");
        attributeNames.add("name");
        attributeNames.add("height");
        attributeNames.add("weight");
        attributeNames.add("hometown");
        attributeNames.add("highSchool");
        return attributeNames;
    }

    @Override
    public String getAttribute(int n) {
        return null;
    }

    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> attributes = new ArrayList<>();
        attributes.add(String.valueOf(number));
        attributes.add(position);
        attributes.add(getName());
        attributes.add(getHeight().toString());
        attributes.add(String.valueOf(getWeight()));
        attributes.add(getHometown());
        attributes.add(getHighSchool());
        return attributes;
    }

    @Override
    public String getAttributeName(int n) {
        return null;
    }

    @Override
    public String toString() {
        return String.format("Number: %d, Position: %s, Name: %s, Height: %s, Weight: %d, Hometown: %s, High School: %s",
                number, position, getName(), getHeight(), getWeight(), getHometown(), getHighSchool());
    }
}
