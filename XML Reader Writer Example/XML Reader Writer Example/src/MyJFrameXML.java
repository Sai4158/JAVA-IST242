import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MyJFrameXML extends JFrame
{
	MyJPanelWriter pwx;
        MyJPanelReader prx;
	public MyJFrameXML ()
	{
		super ("My First Frame");
//------------------------------------------------------
// Create components: Jpanel, JLabel and JTextField
                pwx = new MyJPanelWriter();
                prx = new MyJPanelReader();
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new GridLayout(1,2));
		getContentPane().add(pwx);
                getContentPane().add(prx);
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (800, 400);
		setVisible(true);
	}
//-------------------------------------------------------------------
}
