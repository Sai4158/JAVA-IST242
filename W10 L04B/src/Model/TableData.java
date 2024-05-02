package Model;
/**
 * Filename: TableData.java
 * Short description: Interface
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

import java.util.ArrayList;

public interface TableData {
    void loadTable();
    ArrayList<TableMember> getTable();
    ArrayList<String> getHeaders();
    ArrayList<String> getLine(int line);
    ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);
}
