package app;/*
 * Filename: App.java
 * Short description: The MVC application, setting up and running the components.
 * IST 242 Assignment: W06
 * @author  Sai Rangineeni
 * @version 2/23/2024
 */

import controller.Controller;
import model.Height;
import model.Model;
import view.View;

public class App {
    public static void main(String[] args) {
        //MVC components
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Update the view
        controller.updateView();
    }
}
/*
Person{name=Marcus Allen, height=5'2", weight=200, hometown=Upper Marlboro, Md., highSchool=Dr. Henry A. Wise, Jr.} FootballPlayer{number=2, position=S}
Person{name=Kyle Alston, height=5'9", weight=180, hometown=Robbinsville, N.J., highSchool=Robbinsville} FootballPlayer{number=37, position=CB}
Person{name=Troy Apke, height=6'1", weight=220, hometown=Mt. Lebanon, Pa., highSchool=Mount Lebanon} FootballPlayer{number=28, position=S}
Person{name=Matthew Baney, height=6'0", weight=225, hometown=State College, Pa., highSchool=State College} FootballPlayer{number=35, position=LB}
Person{name=, height=0'0", weight=0, hometown=N/A, highSchool=N/A} FootballPlayer{number=0, position=N/A}

Process finished with exit code 0
 */