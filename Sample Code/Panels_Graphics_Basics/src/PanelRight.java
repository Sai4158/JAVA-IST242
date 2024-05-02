import java.awt.*;
import javax.swing.*;
public class PanelRight extends JPanel
{
public PanelRight ()
{
    super ();
    BorderLayout border = new BorderLayout();
    setLayout(border);
    setBackground(Color.red);
    JButton jb1 = new JButton("I am on the North");
    jb1.setBackground(Color.WHITE);
    JButton jb2 = new JButton("I am in the middle");
    jb2.setBackground(Color.yellow);
    JButton jb3 = new JButton("I am on the South)");
    jb3.setBackground(Color.CYAN);
    add(jb1,"North");
    add(jb2,"Center");
    add(jb3,"South");
}
}

