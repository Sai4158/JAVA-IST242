import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
	JButton b1,b2, b3, b4, b5;
	public myJPanelstd()
	{
    	b1 = new JButton("hey");
    	b2 = new JButton("hello");
    	b3 = new JButton("I love Java");
    	b4 = new JButton("here I  am");
    	b5 = new JButton("bye");
//------------------------------------------------------
// Choose a Layout for JPanel and 
// add components to Jpanel according to layout    	
//----------------------------------------------------------------
    	setLayout(null); // you need a null layout for the panel
    	                 // in order to place the components
    	                 // anywhere you want
//----------------------------------------------------------------
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
//------------Placing------------------------------------
                    // x,y, length, height)
		b1.setBounds(new Rectangle(50,50,100,75));
		b2.setBounds(new Rectangle(200,50,100,75));
		b3.setBounds(new Rectangle(250,170,300,100));
		b4.setBounds(new Rectangle(250,300,100,75));
		b5.setBounds(new Rectangle(50,300,100,75));

	}
}
