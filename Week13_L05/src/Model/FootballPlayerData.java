package Model;
/**
 * Filename: FootballPlayerData.java
 * Short description: list of football players with there data
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

import java.util.ArrayList;

public class FootballPlayerData implements TableData, Displayable {
    private ArrayList<TableMember> players;
    // Additional attributes
    private int firstLineToDisplay;
    private int lineToHighlight;
    private int lastLineToDisplay;
    private int linesBeingDisplayed;

    public FootballPlayerData() {
        this.players = new ArrayList<>();
        // This is all the data that will be displayed on the pannel
        //list of 20 players data
        this.players.add(new FootballPlayer("John Doe", new Height(6, 0), 220, "Springfield", "Springfield High", 10, "QB"));
        this.players.add(new FootballPlayer("Jane Smith", new Height(5, 5), 130, "Newtown", "Newtown High", 28, "RB"));
        this.players.add(new FootballPlayer("Mike Johnson", new Height(6, 2), 215, "Oakridge", "Oakridge Academy", 88, "WR"));
        this.players.add(new FootballPlayer("Emily Davis", new Height(5, 8), 140, "Brookside", "Brookside", 12, "CB"));
        this.players.add(new FootballPlayer("Chris Wong", new Height(6, 1), 200, "Laketown", "Laketown High", 22, "S"));
        this.players.add(new FootballPlayer("Olivia Brown", new Height(5, 6), 135, "Hilltop", "Hilltop School", 30, "LB"));
        this.players.add(new FootballPlayer("Ethan Lee", new Height(5, 10), 190, "Riverside", "Riverside College", 45, "TE/H"));
        this.players.add(new FootballPlayer("Sophia Garcia", new Height(5, 7), 145, "Eastwood", "Eastwood High", 33, "DE"));
        this.players.add(new FootballPlayer("Aiden Martinez", new Height(6, 3), 230, "Westview", "Westview Prep", 90, "DT"));
        this.players.add(new FootballPlayer("John Doe", new Height(6, 0), 220, "Springfield", "Springfield High", 10, "QB"));
        this.players.add(new FootballPlayer("Jane Smith", new Height(5, 5), 130, "Newtown", "Newtown High", 28, "RB"));
        this.players.add(new FootballPlayer("Mike Johnson", new Height(6, 2), 215, "Oakridge", "Oakridge Academy", 88, "WR"));
        this.players.add(new FootballPlayer("Emily Davis", new Height(5, 8), 140, "Brookside", "Brookside", 12, "CB"));
        this.players.add(new FootballPlayer("Chris Wong", new Height(6, 1), 200, "Laketown", "Laketown High", 22, "S"));
        this.players.add(new FootballPlayer("Luke Adams", new Height(6, 4), 225, "Westfield", "Westfield High", 44, "T"));
        this.players.add(new FootballPlayer("John Doe", new Height(6, 0), 220, "Springfield", "Springfield High", 10, "QB"));
        this.players.add(new FootballPlayer("Jane Smith", new Height(5, 5), 130, "Newtown", "Newtown High", 28, "RB"));
        this.players.add(new FootballPlayer("Mike Johnson", new Height(6, 2), 215, "Oakridge", "Oakridge Academy", 88, "WR"));
        this.players.add(new FootballPlayer("Emily Davis", new Height(5, 8), 140, "Brookside", "Brookside", 12, "CB"));
        this.players.add(new FootballPlayer("Chris Wong", new Height(6, 1), 200, "Laketown", "Laketown High", 22, "S"));
        this.players.add(new FootballPlayer("Olivia Brown", new Height(5, 6), 135, "Hilltop", "Hilltop School", 30, "LB"));
        this.players.add(new FootballPlayer("Olivia Brown", new Height(5, 6), 135, "Hilltop", "Hilltop School", 30, "LB"));
        this.players.add(new FootballPlayer("Isabella Rodriguez", new Height(5, 9), 150, "Southgate", "Southgate Public", 18, "K/P"));
        this.players.add(new FootballPlayer("Alex Green", new Height(6, 1), 210, "Northbay", "Northbay Tech", 58, "G"));
        this.players.add(new FootballPlayer("Luke Adams", new Height(6, 4), 225, "Westfield", "Westfield High", 44, "T"));
        this.players.add(new FootballPlayer("John Doe", new Height(6, 0), 220, "Springfield", "Springfield High", 10, "QB"));
        this.players.add(new FootballPlayer("Jane Smith", new Height(5, 5), 130, "Newtown", "Newtown High", 28, "RB"));
        this.players.add(new FootballPlayer("Mike Johnson", new Height(6, 2), 215, "Oakridge", "Oakridge Academy", 88, "WR"));
        this.players.add(new FootballPlayer("Emily Davis", new Height(5, 8), 140, "Brookside", "Brookside", 12, "CB"));
        this.players.add(new FootballPlayer("Chris Wong", new Height(6, 1), 200, "Laketown", "Laketown High", 22, "S"));
        this.players.add(new FootballPlayer("Olivia Brown", new Height(5, 6), 135, "Hilltop", "Hilltop School", 30, "LB"));
        this.players.add(new FootballPlayer("Zoe Carter", new Height(5, 6), 135, "Shoreline", "Shoreline High", 26, "S"));
        this.players.add(new FootballPlayer("Liam Brown", new Height(5, 11), 198, "Cliffside", "Cliffside Academy", 32, "CB"));
        this.players.add(new FootballPlayer("Emma Thomas", new Height(5, 10), 165, "Pinecrest", "Pinecrest School", 21, "WR"));
        this.players.add(new FootballPlayer("Noah Davis", new Height(6, 0), 245, "Riverdale", "Riverdale High", 55, "LB"));
        this.players.add(new FootballPlayer("Ava Wilson", new Height(5, 8), 140, "Silverton", "Silverton Prep", 47, "RB"));
        this.players.add(new FootballPlayer("Mason Lee", new Height(6, 2), 235, "Oakwood", "Oakwood High", 99, "SN"));
        this.players.add(new FootballPlayer("Mia Harris", new Height(5, 7), 130, "Lakeside", "Lakeside", 19, "LB"));
        this.players.add(new FootballPlayer("Jacob Martinez", new Height(6, 5), 290, "Grandview", "Grandview High", 76, "DT"));


        // Initialize default values
        this.firstLineToDisplay = 0;
        this.lineToHighlight = -1;
        this.lastLineToDisplay = players.size();
        this.linesBeingDisplayed = players.size();
    }

    // Methods from TableData and Displayable interfaces
    @Override
    public void loadTable() {
    }

    // Returns a list containing all players
    @Override
    public ArrayList<TableMember> getTable() {
        return new ArrayList<>(players);
    }

    @Override
    public ArrayList<String> getHeaders() {
        // Headers for the football player data
        ArrayList<String> headers = new ArrayList<>();
        headers.add("Number");
        headers.add("Position");
        headers.add("Name");
        headers.add("Height");
        headers.add("Weight");
        headers.add("Hometown");
        headers.add("High School");
        return headers;
    }

    // The player at the specified index
    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        for (int i = firstLine; i <= lastLine && i < players.size(); i++) {
            lines.add(players.get(i).getAttributes());
        }
        return lines;
    }

    // Getters and setters
    @Override
    public int getFirstLineToDisplay() {
        return firstLineToDisplay; }
    @Override
    public int getLineToHighlight() {
        return lineToHighlight; }
    @Override
    public int getLastLineToDisplay() {
        return lastLineToDisplay; }
    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed; }
    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineToDisplay = firstLine; }
    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.lineToHighlight = highlightedLine; }
    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineToDisplay = lastLine; }
    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines; }

}
