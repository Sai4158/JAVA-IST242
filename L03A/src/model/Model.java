package model;
/*
 * Filename: Model.java
 * Short description: Manages the collection of TableMember objects
 * IST 242 Assignment:L03A
 * @author  Sai Rangineeni
 * @version 3/2/2024
 */


import java.util.ArrayList;

public class Model {
    // Instance Variables -- define your private data
    private ArrayList<TableMember> members;

    // Constructors
    public Model() {
        // initialize default values
        members = new ArrayList<>();
        loadData();
    }

    // Methods
    private void loadData() {
        // Add FootballPlayer
        members.add(new FootballPlayer("Marcus Allen", new Height(5, 2), 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.", 2, "S"));
        members.add(new FootballPlayer("Kyle Alston", new Height(5, 9), 180, "Robbinsville, N.J.", "Robbinsville", 37, "CB"));
        members.add(new FootballPlayer("Troy Apke", new Height(6, 1), 220, "Mt. Lebanon, Pa.", "Mount Lebanon", 28, "S"));
        members.add(new FootballPlayer("Matthew Baney", new Height(6, 0), 225, "State College, Pa.", "State College", 35, "LB"));
        members.add(new FootballPlayer());
    }

    // Get and set methods
    public ArrayList<TableMember> getMembers() {
        return members;

    }
    public void setMembers(ArrayList<TableMember> members) {
        this.members = members;
    }


}
