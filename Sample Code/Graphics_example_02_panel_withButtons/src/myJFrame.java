import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	public myJFrame ()
	{
		super ("A Simple Java Frame");
  	 	myJPanel mjp = new myJPanel();
		add(mjp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}

}
