package Controller;

/**
 * Filename: Controller.java
 * Short description: Controls between the Model and View
 * IST 242 Assignment: L03B
 * @author Sai Rangineeni
 * @version 3/15/2024
 */

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

//=========used in L03B =====================================================
        view.basicDisplay("------------------------------------------------------");
        view.basicDisplay(model.getFpData().getHeaders());
        view.basicDisplay("size of headers=" + model.getFpData().getHeaders().size());
        view.basicDisplay("------------------------------------------------------");
        view.basicDisplay(model.getFpData().getLine(100));
        view.basicDisplay("------------------------------------------------------");
        view.linesDisplay(model.getFpData().getLines(100,103));
        view.basicDisplay("size of lines=" + model.getFpData().getLines(100,103).size());
        view.basicDisplay("size of line 0=" + model.getFpData().getLines(100,103).get(0).size());
        view.basicDisplay("------------------------------------------------------");

//=========used in L03A =====================================================
//        view.basicDisplay(model.getMembers().get(1).getAttributeName(3));
//        view.basicDisplay(model.getMembers().get(1).getAttribute(3));
//        view.basicDisplay(model.getMembers().get(1).getAttributeNames());
//        view.basicDisplay(model.getMembers().get(1).getAttributes());
//        view.basicDisplay("size of names=" + model.getMembers().get(1).getAttributeNames().size());
//        view.basicDisplay("size of attributes=" + model.getMembers().get(1).getAttributes().size());
    }

}
