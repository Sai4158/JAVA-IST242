    /*
     * Filename: App.java
     * Short description: MVC application
     * IST 242 Assignment: W09: L04A
     * @author Sai Rangineeni
     * @version 3/22/2024
     */
    import Controller.Controller;
    import Model.Model;
    import View.View;

    class App
    {
        //Main class
        public static void main(String[] args)
        {
            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(model, view);
        }
    }
