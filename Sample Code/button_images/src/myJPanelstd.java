import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
	public myJPanelstd()
	{
            setBackground(Color.pink);
            setLayout(new GridLayout(4,1,10,10));
	    JButton jb1, jb2;
            JLabel lab1,lab2;
            
            ImageIcon imageRon = new ImageIcon("images/r10.jpg");//creates the image to be used in a JButton
            ImageIcon imageRona = new ImageIcon("images/r10a.jpg");//creates the image to be used in a JButton
            ImageIcon imageRonb = new ImageIcon("images/r10b.jpg");//creates the image to be used in a JButton
            ImageIcon imageRonc = new ImageIcon("images/r10c.jpg");//creates the image to be used in a JButton
	    jb1 = new JButton(imageRon); //JButton created with an image
            jb1.setText("image and text on a JButton- Ronaldinho");// adds a text to an existing button
            jb1.setHorizontalTextPosition(AbstractButton.LEFT);

            jb2 = new JButton();
            jb2.setIcon(imageRona);// image added after the button is already created

	    lab1 = new JLabel();
            lab1.setOpaque(true);
            lab1.setBackground(Color.white);
	    lab1.setIcon(imageRonb); // adds an image to an existing label

        lab2 = new JLabel("image and text on a JLabel - Ronaldinho played at Atletico Mineiro in 2013");
            lab2.setHorizontalTextPosition(AbstractButton.CENTER);
            lab2.setOpaque(true);
            lab2.setForeground(Color.white);
            lab2.setBackground(Color.black);
	    lab2.setIcon(imageRonc); // adds an image to an existing label
            add(jb1);
            add(jb2);
            add(lab1);
            add(lab2);
	}
}
