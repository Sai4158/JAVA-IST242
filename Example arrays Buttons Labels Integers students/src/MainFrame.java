
import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame
{

    InitialPanel mjp;

    public MainFrame()
    {
        super("Arrays of Buttons");
        setupLayoutForMacs();
        //------------------------------------------------------
        // Create components
        mjp = new InitialPanel();
        //------------------------------------------------------
        add(mjp, "Center");
//------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }

    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }
}
