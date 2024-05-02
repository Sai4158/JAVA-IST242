package app;/*
 * Filename: App.java
 * Short description: this will set up the model, view, and controller and initiates the program.
 * IST 242 Assignment: L01C
 * @author  Sai Rangineeni
 * @version 2/10/2024
 */


import controller.Controller;
import model.Model;
import view.View;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

    }

}

/*
Person{name=Marcus Allen, height=5'2", weight=200, hometown=Upper Marlboro, Md., highSchool=Dr. Henry A. Wise, Jr.}
Person{name=Kyle Alston, height=5'9", weight=180, hometown=Robbinsville, N.J., highSchool=Robbinsville}
Person{name=Troy Apke, height=6'1", weight=220, hometown=Mt. Lebanon, Pa., highSchool=Mount Lebanon}
Person{name=Matthew Baney, height=6'0", weight=225, hometown=State College, Pa., highSchool=State College}
Person{name=, height=0'0", weight=0, hometown=N/A, highSchool=N/A}
invalid input parameter

Process finished with exit code 0

 */
