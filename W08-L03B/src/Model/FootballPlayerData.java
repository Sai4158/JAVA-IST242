package Model;

import java.util.ArrayList;

/**
 * Filename: FootballPlayerData.java
 * Short description: Handles the data of football players.
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

public class FootballPlayerData implements TableData {
    // Instance Variables
    private ArrayList<TableMember> players;

    // Constructors
    public FootballPlayerData() {
        // Initialize default values
        players = new ArrayList<>();
        loadTable();
    }

    // Methods from the TableData interface
    @Override
    public void loadTable() {
        // Implement method to read XML and fill players ArrayList
        // Placeholder for the ReadPlayersFromXML() method implementation
    }

    @Override
    public ArrayList<TableMember> getTable() {
        // Return the full table of data
        return players;
    }

    @Override
    public ArrayList<String> getHeaders() {
        // Return an ArrayList<String> with the names of the FootballPlayer fields (the "headers")
        ArrayList<String> headers = new ArrayList<>();
        // Assuming a FootballPlayer instance is available, get attribute names from it
        // Placeholder for getting headers from a FootballPlayer instance
        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        // Return an ArrayList<String> with the values of the FootballPlayer object in a chosen line "n" in the table
        ArrayList<String> lineData = new ArrayList<>();
        // Placeholder for getting line data from a FootballPlayer instance
        return lineData;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        // Returns an array of arrays with lines from firstLine to lastLine
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        // Placeholder for getting multiple lines of data
        return lines;
    }

}
