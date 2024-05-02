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

        view.display(model.getEp1().toString());
        view.display(model.getEp2().toString());
        view.display(model.getEp3().toString());

        //................
    }

}
