package controller;/*
 * Filename: Controller.java
 * Short description: Model and View, retrieves data and initiates its display.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
 */


import model.Model;
import view.View;

import java.util.ArrayList;

public class Controller {
    // Instance Variables -- define your private data
    private Model model;
    private View view;

    // Constructors
    public Controller(Model model, View view) {
        // initialize default values
        this.model = model;
        this.view = view;

    }

    public void updateView() {
        //Retrieve
        ArrayList<String> data = model.getData();
        // Display
        view.basicDisplay(data);


    }

}
