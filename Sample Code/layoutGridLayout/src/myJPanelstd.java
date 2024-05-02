import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
	myJPanel1 mjp1;
	myJPanel2 mjp2;
	myJPanel3 mjp3;
	myJPanel4 mjp4;
	myJPanel5 mjp5;
	public myJPanelstd()
	{
    	mjp1 = new myJPanel1();
    	mjp2 = new myJPanel2();
    	mjp3 = new myJPanel3();
    	mjp4 = new myJPanel4();
    	mjp5 = new myJPanel5();
//------------------------------------------------------
// Choose a Layout for JPanel and 
// add components to Jpanel according to layout    	
		setLayout(new GridLayout(3,2));
		add(mjp1);
		add(mjp2);
		add(mjp3);
		add(mjp4);
		add(mjp5);

	}
}
