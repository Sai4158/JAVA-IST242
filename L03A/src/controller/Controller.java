package controller;
/*
 * Filename: Controller.java
 * Short description:  Between the model and view
 * IST 242 Assignment:L03A
 * @author  Sai Rangineeni
 * @version 3/2/2024
 */


import model.Model;
import model.TableMember;
import view.View;

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

    // Update view with data from model
    public void updateView() {
        TableMember secondMember = model.getMembers().get(1);

        view.basicDisplay("height");
        view.basicDisplay(secondMember.getAttribute(3)); // height
        view.basicDisplay("number position name height weight hometown highSchool ");
        view.basicDisplay(secondMember.toString());
        view.basicDisplay("size of names=" + secondMember.getAttributeNames().size());
        view.basicDisplay("size of attributes=" + secondMember.getAttributes().size());
    }
}
