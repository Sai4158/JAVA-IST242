import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;

public class MyJPanelReader extends JPanel 
{
   	XML_240 x2;
	public MyJPanelReader()
	{
            JButton b1 = new JButton("You have to read what you wrote, same types, same order");
            add(b1);
//=====================================
		x2 = new XML_240(); // creates the 240 class that reads and writes XML
//=====================================
		String s1 = "";
                String s2 = "";
                int num = 0;
                x2.openReaderXML("XML_test.xml");
                s1 = (String)x2.ReadObject();
                s2 = (String)x2.ReadObject();
                num = (Integer)x2.ReadObject();
                x2.closeReaderXML();                
                //these statements above just open an xml file, read 3 lines in the file, then close it.
                //it is reading the XML file
                JButton b2 = new JButton("contents of s1 = "+s1);
                add(b2);
                JButton b3 = new JButton("contents of s2 = "+s2);
                add(b3);
                JButton b4 = new JButton("contents of num = "+num);
                add(b4);
                
	}

}
