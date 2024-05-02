package View;
/*
 * Filename: InitialPanel.java
 * Short description: Buttons for the MVC application's UI
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class InitialPanel extends JPanel
{
    // Declare buttons
    private JButton button1;
    private JButton button2;
    private JButton button3;


    public InitialPanel()
    {
        super();

        // A grid layout with 3 rows, 1 column
        setLayout(new GridLayout(3, 1));
        setBackground(Color.darkGray);

        // buttons
        button1 = new JButton("Student 1");
        button2 = new JButton("Student 2");
        button3 = new JButton("Student 3");

        // Add buttons
        add(button1);
        add(button2);
        add(button3);
    }

    // Text of a button based on its index
    public void setButtonInfo(String text, int buttonIndex) {

        // Set the text
        if (buttonIndex == 0) {
            button1.setText(text);
        }

        else if (buttonIndex == 1) {
            button2.setText(text);
        }

        else if (buttonIndex == 2) {
            button3.setText(text);
        }



    }

    //Getters for the buttons
    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;

    }
}
