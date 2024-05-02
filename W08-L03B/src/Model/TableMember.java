package Model;

/**
 * Filename: TableMember.java
 * Short description: Interface that defines methods
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import java.util.ArrayList;

public interface TableMember {
    ArrayList<String> getAttributes();
    String getAttribute(int n);
    String getAttributeName(int n);
    ArrayList<String> getAttributeNames();
}
