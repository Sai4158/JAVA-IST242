package model;
/**
 * Filename: TableMember.java
 * Short description: Interface to be implemented by classes that represent table members.
 * IST 242 Assignment: L03A
 * @author Sai Rangineeni
 * @version 3/2/2024
 */

import java.util.ArrayList;

public interface TableMember
{
    public String getAttribute(int n);
    public ArrayList<String> getAttributes();
    public String getAttributeName(int n);
    public ArrayList<String> getAttributeNames();
}

