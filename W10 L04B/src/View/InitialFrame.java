package View;
/**
 * Filename: InitialFrame.java
 * Short description: The main window frame for the app
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */
import javax.swing.*;

public class InitialFrame extends JFrame {
    private InitialPanel initialPanel;

    public InitialFrame() {
        // Create the main panel
        initialPanel = new InitialPanel();
        setContentPane(initialPanel);
        setTitle("Football Players (Sai Rangineeni)");
        //set exit on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make the frame visible
        setVisible(true);
    }
}
