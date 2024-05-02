package controller;
/*
 * Filename: Controller.java
 * Short description: Manages the data between Model and View
 * IST 242 Assignment: L01B
 * @author  Sai Rangineeni
 * @version 2/9/2024 (updated)
 */


import model.Model;
import view.View;

public class Controller {
    // Instance Variables -- define your private data
    private Model model;
    private View view;


    // Constructors
    public Controller(View v, Model m) {
        // initialize default values
        this.view = v;
        this.model = m;
        displayData();
    }

    private void displayData() {
        // Display data from each Person object
        view.basicDisplay(model.getP1().toString());
        view.basicDisplay(model.getP2().toString());
        view.basicDisplay(model.getP3().toString());
        view.basicDisplay(model.getP4().toString());
        view.basicDisplay(model.getP5().toString());

        view.basicDisplay("invalid input parameter");
    }
}
