package Controller;

import Model.Model;
import View.View;

public class Controller
{

    Model model;
    View view;

    public Controller(View v, Model m)
    {
        model = m;
        view = v;
//        
        view.display(model.getEps().get(0).toString());
        view.display(model.getEps().get(1).toString());
        view.display(model.getEps().get(2).toString());

        //possible problem  below 
        
       // view.display(model.getEps().toString());//This is not wat is being asked in the lab
        
        //view.basicDisplay(model.getData());  <<<< this methods "replaces" the 3 lines above

//        view.display(model.getEp1().toString());
//        view.display(model.getEp2().toString());
//        view.display(model.getEp3().toString());

        //................
    }

}
