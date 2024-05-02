package View;

import javax.swing.*;

public class MainFrame extends JFrame {
    //instance variables
    private InitialPanel ip;


    //constructor - uses same class name
    public MainFrame(){

        //super - title - put ur name too
        //sets the window title
        super("Graphics Demo - Sai Rangineeni");

        //crate pannel
        ip = new InitialPanel();
        add(ip);

        //must
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,480);
        //set window visible to true- default is one flase
        setVisible(true);

    }

}
