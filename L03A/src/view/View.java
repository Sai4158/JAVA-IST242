package view;
/*
 * Filename: View.java
 * Short description: Displays information to the user.
 * IST 242 Assignment:L03A
 * @author  Sai Rangineeni
 * @version 3/2/2024
 */


import java.util.ArrayList;

public class View {
    // Instance Variables -- define your private data


    // Constructors
    public View() {
        // initialize default values
    }

    public void basicDisplay(String s){
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        //newline
        System.out.println();
    }
}
