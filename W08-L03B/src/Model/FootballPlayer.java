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
    // Instance Variables
    private int number;
    private String position;

    // Constructors
    public FootballPlayer() {
        // Initialize default values
    }

    public FootballPlayer(int number, String position, String name, Height height, int weight, String hometown, String highSchool) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    // Set methods
    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Get methods
    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    // TableMember interface methods implementation
    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> attributes = new ArrayList<>();
        attributes.add(String.valueOf(getNumber()));
        attributes.add(getPosition());
        attributes.add(getName());
        attributes.add(getHeight().toString()); // Assuming getHeight() calls Height's toString() method
        attributes.add(String.valueOf(getWeight()));
        attributes.add(getHometown());
        attributes.add(getHighSchool());
        return attributes;
    }

    @Override
    public String getAttribute(int n) {
        // Implementation should match the order of attributes in the class and be zero-based index
        switch (n) {
            case 0: return String.valueOf(getNumber());
            case 1: return getPosition();
            case 2: return getName();
            case 3: return getHeight().toString(); // Assuming getHeight() calls Height's toString() method
            case 4: return String.valueOf(getWeight());
            case 5: return getHometown();
            case 6: return getHighSchool();
            default: throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + getAttributeNames().size());
        }
    }

    @Override
    public String getAttributeName(int n) {
        ArrayList<String> attributeNames = getAttributeNames();
        if (n >= 0 && n < attributeNames.size()) {
            return attributeNames.get(n);
        } else {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + attributeNames.size());
        }
    }

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

    // Additional methods
    @Override
    public String toString() {
        return "FootballPlayer{" +
                "number=" + number +
                ", position='" + position + '\'' +
                ", " + super.toString() +
                '}';
    }
}
