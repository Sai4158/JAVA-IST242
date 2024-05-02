import java.awt.*;
import javax.swing.*;

public class panelLeft extends JPanel
{
	public panelLeft()
	{
		super();
		setBackground(Color.cyan);
                JButton b1 = new JButton("a button on the left panel");
                add(b1);
	}
}