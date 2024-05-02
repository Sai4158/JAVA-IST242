package view;/*
 * Filename: view.java
 * Short description: Responsible for presenting data to the user.
 * IST 242 Assignment: W05: L01D
 * @author  Sai Rangineeni
 * @version 2/15/2024
 */

import java.util.ArrayList;

public class View {
    // Constructors
    public View() {
        // initialize default values
    }

    // Additional methods -- such as for calculation, display
    public void basicDisplay(String s) {
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}