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
//main class
    public static void main(String[] args)
    {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
    }
}

/*------------------------------------------------------
number position name height weight hometown highSchool
size of headers=7
------------------------------------------------------
62 G Zach Simpson 6'3" 272 Hollidaysburg, Pa. Hollidaysburg Area
------------------------------------------------------
62 G Zach Simpson 6'3" 272 Hollidaysburg, Pa. Hollidaysburg Area
24 S Anthony Smith 6'0" 206 Dover, N.J. Pope John XXIII
47 LB Brandon Smith 6'0" 223 Winfield, Pa. Lewisburg
size of lines=3
size of line 0=7
------------------------------------------------------

Process finished with exit code 0

 */