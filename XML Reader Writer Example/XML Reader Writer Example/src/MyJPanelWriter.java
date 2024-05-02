import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;

public class MyJPanelWriter extends JPanel 
{
   	XML_240 x2;
	public MyJPanelWriter()
	{
            JButton b1 = new JButton("Check xml file outside NetBeans to see contents");
            add(b1);
//=====================================
		x2 = new XML_240(); // creates the 240 class that reads and writes XML
//=====================================
		String s1 = "Hey I am a string living on an xml file";
                String s2 = "Fred made me do it!";
                int num = 1855;
                x2.openWriterXML("XML_test.xml");
                x2.writeObject(s1);
                x2.writeObject(s2);
                x2.writeObject(num);
                x2.closeWriterXML();
                //these statements above just open an xml file, write 3 lines in the file, close it.
                //open the xml file outside Netbeans and check the contents
	}

}
