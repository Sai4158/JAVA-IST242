import java.awt.*;
import javax.swing.*;
public class myJPanel1 extends JPanel 
{
	public myJPanel1()
	{
		setBackground(Color.pink);
		JButton jb1 = new JButton("I am a Button floating around in the center Panel");
		add(jb1);
	}
}
