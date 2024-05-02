package Model;
/**
 * Filename: FootballPlayer.java
 * Short description: Represents a football player
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {
    //instance varibles
    private int number;
    private String position;

    //constructors
    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    // TableMember methods
    @Override
    public String getAttribute(int n) {
        switch (n) {
            case 0: return String.valueOf(number);
            case 1: return position;
            case 2: return getName();
            case 3: return getHeight().toString();
            case 4: return String.valueOf(getWeight());
            case 5: return getHometown();
            case 6: return getHighSchool();
            default: return null;
        }
    }

    @Override
    public String getAttributeName(int n) {
        ArrayList<String> attributeNames = new ArrayList<>();
        //add to the pannel
        attributeNames.add("Number");
        attributeNames.add("Position");
        attributeNames.add("Name");
        attributeNames.add("Height");
        attributeNames.add("Weight");
        attributeNames.add("Hometown");
        attributeNames.add("High School");
        return attributeNames.get(n);
    }

    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> attributes = new ArrayList<>();
        //add to the pannel
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
    public ArrayList<String> getAttributeNames() {
        ArrayList<String> attributeNames = new ArrayList<>();
        //add to the pannel
        attributeNames.add("Number");
        attributeNames.add("Position");
        attributeNames.add("Name");
        attributeNames.add("Height");
        attributeNames.add("Weight");
        attributeNames.add("Hometown");
        attributeNames.add("High School");
        return attributeNames;
    }

    //To String
    @Override
    public String toString() {
        return "FootballPlayer{" +
                "number=" + number +
                ", position='" + position +
                '}';
    }
}
