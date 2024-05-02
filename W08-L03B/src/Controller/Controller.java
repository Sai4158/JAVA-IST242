package Controller;

/**
 * Filename: Controller.java
 * Short description: Controls between the Model and View
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

import Model.Model;
import View.View;

public class Controller {
    // Instance Variables
    private Model model;
    private View view;

    // Constructors
    public Controller() {
        // initialize default values
    }

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        updateView();
    }

    // Set methods
    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }

    // Get methods
    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }

    // Additional methods
    private void updateView() {
        // Update the view
        view.basicDisplay(model.getFpData().getHeaders());
        view.basicDisplay("size of headers=" + model.getFpData().getHeaders().size());

    }

    public String toString() {
        return "Controller managing interactions between Model and View";
    }
}
