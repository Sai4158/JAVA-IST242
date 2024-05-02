package Default_Package; /**
 * Filename: Default_Package.App.java
 * Short description: Sets up the MVC components
 * IST 242 Assignment: L01B
 * @author  Sai Rangineeni
 * @version 2/9/2024 (updated)
 */

import controller.Controller;
import model.Model;
import view.View;

public class App {
    // Main method
    public static void main(String[] args) {
        // Create Model and View objects
        Model model = new Model();
        View view = new View();

        // Create a Controller object and pass Model and View to it
        Controller controller = new Controller(view, model);
    }
}

/*
Person{name=Marcus Allen, weight=200, hometown=Upper Marlboro, Md., highSchool=Dr. Henry A. Wise, Jr.}
Person{name=Kyle Alston, weight=180, hometown=Robbinsville, N.J., highSchool=Robbinsville}
Person{name=Troy Apke, weight=220, hometown=Mt. Lebanon, Pa., highSchool=Mount Lebanon}
Person{name=Matthew Baney, weight=225, hometown=State College, Pa., highSchool=State College}
Person{name=, weight=0, hometown=N/A, highSchool=N/A}
invalid input parameter

Process finished with exit code 0

 */