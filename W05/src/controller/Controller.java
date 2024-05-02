package controller;/*
 * Filename: Controller.java
 * Short description: Mediates interactions between the Model and View.
 * IST 242 Assignment: W05: L01D
 * @author  Sai Rangineeni
 * @version 2/15/2024
 */

import model.Model;
import view.View;
import java.util.ArrayList;

public class Controller {
    // Instance Variables -- define your private data
    private Model model;
    private View view;

    // Constructors
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    // Additional methods -- such as for calculation, display
    public void updateView() {
        ArrayList<String> data = model.getData();
        view.basicDisplay(data);
    }
}

