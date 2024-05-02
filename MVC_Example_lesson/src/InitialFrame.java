
import java.awt.*;
import javax.swing.*;

public class InitialFrame extends JFrame

{

    private InitialPanel ip;

    InitialFrame()
    {
        super("IST 242 - word game - MVC Example");
        LayoutSetupMAC();
        ip = new InitialPanel();
        add(ip);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public InitialPanel getInitialPanel()
    {
        return ip;
    }

    public void setInitialPanel(InitialPanel cp)
    {
        this.ip = cp;
    }

    void LayoutSetupMAC()
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
