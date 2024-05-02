package controller;/*
 * Filename: Controller.java
 * Short description: It mediates between the view and the model and decides what to display.
 * IST 242 Assignment: L01C
 * @author  Sai Rangineeni
 * @version 2/10/2024
 */


import model.Model;
import view.View;

public class Controller {
    // Instance Variables -- define your private data
    private Model model;
    private View view;

    // Constructors
    public Controller(Model m, View v) {
        // initialize default values
        this.model = m;
        this.view = v;
        displayData();
    }

    // Method to display data from the model
    private void displayData() {
        // Display data for each Person object
        for (int i = 1; i <= 5; i++) {
            view.basicDisplay(model.getData(i));
        }
        // Display data for an invalid index to show error handling
        view.basicDisplay(model.getData(6));
    }
}