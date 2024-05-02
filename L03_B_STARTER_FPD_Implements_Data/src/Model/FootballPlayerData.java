package Model;

/**
 * Filename: FootballPlayerData.java
 * Short description: Handles the data of football players
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootballPlayerData implements TableData {

    private ArrayList<TableMember> players;

    public FootballPlayerData() {
        players = new ArrayList<>();
        loadTable();
    }

    @Override
    public void loadTable() {
        ReadPlayersFromXML();
    }

    // Method to read players
    public void ReadPlayersFromXML() {
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")))) {
            Object obj = null;
            while ((obj = decoder.readObject()) != null) {
                if (obj instanceof FootballPlayer) {
                    players.add((FootballPlayer) obj);
                }
            }
        } catch (ArrayIndexOutOfBoundsException end) {
            // This exception is expected
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<TableMember> getTable() {
        return players;
    }

    @Override
    public ArrayList<String> getHeaders() {
        if (!players.isEmpty()) {
            return players.get(0).getAttributeNames();
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<String> getLine(int line) {
        if (line >= 0 && line < players.size()) {
            return players.get(line).getAttributes();
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        // Ensure firstLine and lastLine
        firstLine = Math.max(firstLine, 0);
        lastLine = Math.min(lastLine, players.size());
        if (firstLine <= lastLine) {
            List<TableMember> subList = players.subList(firstLine, lastLine);
            lines.addAll(subList.stream().map(TableMember::getAttributes).collect(Collectors.toList()));
        }
        return lines;
    }
}
