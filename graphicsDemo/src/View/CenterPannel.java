package View;

import javax.swing.*;
import java.awt.*;

public class CenterPannel extends JPanel {

    //instance variables
    private JButton jb1;
    private JButton jb2;
    private JButton jb3;

    //constructor
    public CenterPannel(){
        //creates grid
    setLayout(new GridLayout(3,1,5,5));
    setBackground(Color.CYAN);

    //create the buttons - text on the button
        jb1 = new JButton("Button 1");
        jb2 = new JButton("Button 2");
        jb3 = new JButton("Button 3");

        //addig buttons to the pannel
        add(jb1);
        add(jb2);
        add(jb3);

    }
    //set and get methods -  genrated


    public JButton getJb1() {
        return jb1;
    }

    public void setJb1(JButton jb1) {
        this.jb1 = jb1;
    }

    public JButton getJb2() {
        return jb2;
    }

    public void setJb2(JButton jb2) {
        this.jb2 = jb2;
    }

    public JButton getJb3() {
        return jb3;
    }

    public void setJb3(JButton jb3) {
        this.jb3 = jb3;
    }
}
