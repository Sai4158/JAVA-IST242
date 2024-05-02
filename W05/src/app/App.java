package app;
/*
 * Filename: App.java
 * Short description: This is the main entry point of the application that sets MVC framework.
 * IST 242 Assignment: W05: L01D
 * @author  Sai Rangineeni
 * @version 2/15/2024
 */

import controller.Controller;
import model.Model;
import view.View;

public class App {
    public static void main(String[] args) {
        // Create the MVC components
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        // Start the application
        controller.updateView();
    }
}

/*
Person{name=Marcus Allen, height=5'2", weight=200, hometown=Upper Marlboro, Md., highSchool=Dr. Henry A. Wise, Jr.}
Person{name=Kyle Alston, height=5'9", weight=180, hometown=Robbinsville, N.J., highSchool=Robbinsville}
Person{name=Troy Apke, height=6'1", weight=220, hometown=Mt. Lebanon, Pa., highSchool=Mount Lebanon}
Person{name=Matthew Baney, height=6'0", weight=225, hometown=State College, Pa., highSchool=State College}
Person{name=, height=0'0", weight=0, hometown=, highSchool=}

Process finished with exit code 0
 */