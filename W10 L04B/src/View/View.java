package View;
/**
 * Filename: View.java
 * Short description: Represents the GUI for the app
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */
import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private InitialFrame initialFrame;
    public View() {
        InitialPanel initialPanel = new InitialPanel();
        //Window title
        this.setTitle("Football Player Viewer (Sai Rangineeni)");
        //set exit on close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // The InitialPanel to the JFrame
        this.setContentPane(initialPanel);
        //Window size
        this.setSize(1050, 600);
        // Making the JFrame visible
        this.setVisible(true);
    }

    // To update the data provided
    public void updateDisplay(Object data) {

    }
}