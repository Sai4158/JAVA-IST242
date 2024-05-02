import java.awt.*;
import javax.swing.*;

public class myJPanel extends JPanel
{
	public myJPanel()
	{
		super();
		setBackground(Color.yellow);
                //add
                GridLayout gr = new GridLayout(1,1, 10, 5);
                setLayout(gr);

                //add
                panelLeft pl = new panelLeft();
                add(pl);

                //add
                panelRight pr = new panelRight();
                add(pr);
	}
}