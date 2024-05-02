package View;
/*
 * Filename: MainFrame.java
 * Short description: This contains other panels and components
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */
import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame
{

    private InitialPanel initialPanel;

    public MainFrame()
    {
        super("Sai Rangineeni");
        initialPanel  = new InitialPanel();
        add(initialPanel , "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(720, 280);
        setVisible(true);
    }

    // Getter for the initial panel
    public InitialPanel getInitialPanel() {
        return initialPanel;
    }
}

