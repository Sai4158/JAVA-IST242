/**
 * Filename: App.java
 * Short description: The main class MVC and starts the app
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 4/5/2024
 */
import Controller.Controller;
import Model.Model;
import View.View;

public class App {
    public static void main(String[] args) {
        //Will run MVC
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

    }
}
