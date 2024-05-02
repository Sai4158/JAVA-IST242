import java.awt.*;
import javax.swing.*;

public class myJFrame9 extends JFrame
{
	myJPanel9 mjp;
	public myJFrame9 ()
	{
		super ("My First Frame");
//------------------------------------------------------
// Create components: Jpanel
    	mjp = new myJPanel9();
    	mjp.setBackground(Color.white);
//------------------------------------------------------
// add JPanel to JFrame    	
		getContentPane().add(mjp,"Center");
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (800, 600);
		show();
	}

}
