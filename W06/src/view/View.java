package view;/*
 * Filename: View.java
 * Short description: Responsible for presenting data to the user.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
 */

import java.util.ArrayList;

public class View {

    // Constructors
    public View() {

    }

    public void basicDisplay(String S){
        System.out.println(S);

    }
    // Method to display an ArrayList of strings
    public void basicDisplay(ArrayList<String> arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}