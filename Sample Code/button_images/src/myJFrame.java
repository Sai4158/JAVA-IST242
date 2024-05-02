import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	myJPanelstd mjp;
	public myJFrame ()
	{
		super ("Images on Buttons and Labels");
//------------------------------------------------------
// Create components
    	mjp = new myJPanelstd();
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mjp,"Center");
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (800, 700);
		setVisible(true);
	}
}
