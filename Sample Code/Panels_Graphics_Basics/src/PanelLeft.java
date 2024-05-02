import java.awt.*;
import javax.swing.*;
public class PanelLeft extends JPanel
{
public PanelLeft ()
{
    super ();
    GridLayout grid = new GridLayout(1,3);
    setLayout(grid);
    setBackground(Color.yellow);
    JButton jb1 = new JButton("I belong to panel left)");
    JButton jb2 = new JButton("Hi");
    jb2.setBackground(Color.red);
    JButton jb3 = new JButton("I am a JButton)");
    add(jb1);
    add(jb2);
    add(jb3);
}
}

