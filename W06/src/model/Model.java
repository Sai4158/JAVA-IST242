package model;/*
 * Filename: Model.java
 * Short description: Manages a collection of FootballPlayer objects.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
 */


import java.util.ArrayList;

public class Model {
    // Instance Variables -- define your private data
    private ArrayList<FootballPlayer> players;

    // Constructors
    public Model() {
        // initialize default values
        players = new ArrayList<>();
        loadData();
    }

    // loadData method to populate the ArrayList with FootballPlayer
    public void loadData(){
        // Use the full-parameter constructor to add FootballPlayer objects
        players.add(new FootballPlayer("Marcus Allen", new Height(5, 2), 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.", 2, "S"));
        players.add(new FootballPlayer("Kyle Alston", new Height(5, 9), 180, "Robbinsville, N.J.", "Robbinsville", 37, "CB"));
        players.add(new FootballPlayer("Troy Apke", new Height(6, 1), 220, "Mt. Lebanon, Pa.", "Mount Lebanon", 28, "S"));
        players.add(new FootballPlayer("Matthew Baney", new Height(6, 0), 225, "State College, Pa.", "State College", 35, "LB"));
        players.add(new FootballPlayer());
    }

    // Data retrieval method
    public ArrayList<String> getData() {
        ArrayList<String> dataStrings = new ArrayList<>();
        for (FootballPlayer player : players) {
            dataStrings.add(player.toString());
        }
        return dataStrings;
    }
}
