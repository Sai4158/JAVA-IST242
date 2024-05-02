package Model;

/**
 * Filename: TableData.java
 * Short description: Interface that defines methods
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import java.util.ArrayList;
public interface TableData
{
    public void loadTable();
    public ArrayList getTable();
    public ArrayList<String> getHeaders();
    public ArrayList<String> getLine(int line);
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);
}
