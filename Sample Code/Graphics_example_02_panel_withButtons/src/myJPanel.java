import java.awt.*;
import javax.swing.*;

public class myJPanel extends JPanel
{
	public myJPanel()
	{
		super();
		setBackground(Color.yellow);

        //this is how u added to the pannel 
                JButton b1 = new JButton("a button");
                add(b1);
                JTextField tf1 = new JTextField("a text field");
                add(tf1);
                JLabel l1 = new JLabel("a label");
                add(l1);
		
	}
}