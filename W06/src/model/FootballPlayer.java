package model;/*
 * Filename: FootballPlayer.java
 * Short description: Extending the Person class with additional attributes for a player's number and position.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
 */


public class FootballPlayer extends Person {
    // Instance Variables -- define your private data
    private int number;
    private String position;

    // Constructors
    public FootballPlayer() {
        super();
        this.number = 0;
        this.position = "N/A";
    }

    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        // Call Person constructor with provided values
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

    // Additional methods -- such as for calculation, display

    @Override
    public String toString() {
        return super.toString() + " FootballPlayer{" +
                "number=" + number +
                ", position=" + position +
                '}';
    }

}
