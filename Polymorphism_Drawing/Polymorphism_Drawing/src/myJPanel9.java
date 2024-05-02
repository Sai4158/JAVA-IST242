import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
public class myJPanel9 extends JPanel implements ActionListener
{
    polygon p1;
    triangle t1;
    JButton pol, tri,rect;
	public myJPanel9()
	{         pol = new JButton("draw polygon");
            add(pol);
            pol.addActionListener(this);
            tri = new JButton("draw triangle");
            add(tri);
            tri.addActionListener(this);
            
		setBackground(Color.pink);
                Point pt1 = new Point(100,100);
                Point pt2 = new Point(200,100);
                Point pt3 = new Point(300,150);
                Point pt4 = new Point(400,90);
                Point pt5 = new Point(500,300);
                ArrayList<Point> temp_pt = new ArrayList();
                temp_pt.add(pt1);
                temp_pt.add(pt2);
                temp_pt.add(pt3);
                temp_pt.add(pt4);
                temp_pt.add(pt5);
                p1 = new polygon(temp_pt);
                temp_pt = new ArrayList();
                 pt1 = new Point(400,300);
                 pt2 = new Point(450,300);
                 pt3 = new Point(500,250);
                temp_pt.add(pt1);
                temp_pt.add(pt2);
                temp_pt.add(pt3);
                
                t1 = new triangle(temp_pt);
	}
	public void paintComponent(Graphics g)  //consider g as a pencil that is able to draw on the screen
	{
		super.paintComponent(g);
	}
        
        void PolymorphicDraw(polygon p)
        {
            Graphics gg = getGraphics();
            for (int i=0;i<p.numberOfPoints-1;i++)
            {
                gg.drawLine((int)p.pt.get(i).getX(), (int)p.pt.get(i).getY(), (int)p.pt.get(i+1).getX(), (int)p.pt.get(i+1).getY());
            }
            gg.drawLine((int)p.pt.get(0).getX(), (int)p.pt.get(0).getY(), (int)p.pt.get(p.numberOfPoints-1).getX(), (int)p.pt.get(p.numberOfPoints-1).getY());
            
            
        }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()== pol)
        {
            PolymorphicDraw(p1);
        }
        if (e.getSource()== tri)
        {
            PolymorphicDraw(t1);
        }
    }
	
}
