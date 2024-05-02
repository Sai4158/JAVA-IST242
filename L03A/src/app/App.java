package app;/*
 * Filename: App.java
 * Short description: Entry point for the MVC
 * IST 242 Assignment:L03A
 * @author  Sai Rangineeni
 * @version 3/2/2024
 */


import controller.Controller;
import model.Model;
import view.View;

public class App {
    public static void main(String[] args) {
        // Create the MVC components
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Start the application
        controller.updateView();
    }
}

/*
height
5'9"
number position name height weight hometown highSchool
37 CB Kyle Alston 5'9" 180 Robbinsville, N.J. Robbinsville
size of names=7
size of attributes=7

Process finished with exit code 0
 */