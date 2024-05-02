/**
 * Filename: App.java
 * Short description: Entry point of the application
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */


import Controller.Controller;
import Model.Model;
import View.View;

public class App
{

    public static void main(String[] args)
    {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
    }
}

