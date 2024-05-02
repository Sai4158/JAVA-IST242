import java.awt.*;
import javax.swing.*;
public class myJFrame extends JFrame
{
	public myJFrame ()
	{
		super ("My First Frame");
                // On some MACs it might be necessary to have the statement below 
                //for the background color of the button to appear    
                try 
                    {
                      UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
                    } 
                catch (Exception e) 
                    {
                       e.printStackTrace();
                     }                
                //------------------------------------------------------
                myJPanel mjp = new myJPanel();
                add(mjp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (800, 480);
		setVisible(true);
	}
}
