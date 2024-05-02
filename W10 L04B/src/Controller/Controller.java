package Controller;
/**
 * Filename: Controller.java
 * Short description: Handles the interaction between the Model and View.
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */
import Model.Model;
import View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;

        // Sets the view
        initView();
    }

    private void initView() {
        // initializing the view with model data
        view.updateDisplay(model.getFpData());
    }

}
