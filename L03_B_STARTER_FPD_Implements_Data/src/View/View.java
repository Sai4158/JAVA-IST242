package View;

/**
 * Filename: View.java
 * Short description: Displays text data to the user
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import java.util.ArrayList;

// View class for displaying data
public class View {

    // Displays a single line of text
    public void basicDisplay(String s) {
        System.out.println(s);
    }

    // Displays a list of strings as a single line
    public void basicDisplay(ArrayList<String> arr) {
        System.out.println(String.join(" ", arr));
    }

    // Displays an array of arrays of strings
    public void linesDisplay(ArrayList<ArrayList<String>> arrOfarr) {
        for (ArrayList<String> arr : arrOfarr) {
            basicDisplay(arr);
        }
    }
}
