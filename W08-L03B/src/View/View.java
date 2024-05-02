package View;

/**
 * Filename: View.java
 * Short description: Displays text data to the user
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import java.util.ArrayList;

public class View {
    // Constructors
    public View() {
        // Default constructor
    }

    // Display methods
    public void basicDisplay(String s) {
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public void linesDisplay(ArrayList<ArrayList<String>> arrOfarr) {
        for (ArrayList<String> arr : arrOfarr) {
            basicDisplay(arr);
        }
    }

    public String toString() {
        return "View responsible for displaying data";
    }
}
