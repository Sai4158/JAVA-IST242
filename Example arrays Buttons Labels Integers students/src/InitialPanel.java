
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InitialPanel extends JPanel
{

    ArrayList<RandomButton> buttonArray; // declares the RandomButton ArrayList
    ArrayList<Student> studentArray;// declares the student ArrayList
    ArrayList<JLabel> labelArray; // declares an ArrayList of JLabels
    ArrayList<Integer> integerArray;// declares the integer  ArrayList

    public InitialPanel()
    {
        setBackground(Color.gray);
        setLayout(new GridLayout(23, 1));

        buttonArray = new ArrayList<>(); // creates the ArrayList of RandomButton
        studentArray = new ArrayList<>(); // creates the ArrayList of student
        labelArray = new ArrayList<>(); // creates the ArrayList of JLabel
        integerArray = new ArrayList<>(); // creates the ArrayList of int
        for (int i = 0; i < 20; i++)
        {
            RandomButton rb = new RandomButton();
            buttonArray.add(rb); // now places a real version of a JButton in each position of the array
            add(buttonArray.get(i));
        }

        integerArray.add(44);
        integerArray.add(70);
        integerArray.add(32);

        //============================================
        studentArray.add(new Student("Saquon", "Barkley", integerArray.get(0)));
        //============================================
        //an alternative way of doing the same thing as above
        Student st2 = new Student("Joe", "Paterno", integerArray.get(1));
        studentArray.add(st2);
        //============================================
        studentArray.add(new Student("Ben", "Roethlisberger", integerArray.get(2)));

        labelArray.add(new JLabel(studentArray.get(2).getName()));
        labelArray.get(0).setForeground(Color.black);
        labelArray.get(0).setOpaque(true);// used to show a background color on a JLabel which is usually transparent
        labelArray.get(0).setBackground(Color.yellow);
        add(labelArray.get(0));

        labelArray.add(new JLabel(studentArray.get(1).getName()));
        Font f2 = new Font("Courier", Font.BOLD, 18);
        labelArray.get(0).setFont(f2);
        add(labelArray.get(1));

        labelArray.add(new JLabel(studentArray.get(0).getName()));
        labelArray.get(2).setFont(f2);
        labelArray.get(2).setOpaque(true);// used to show a background color
        labelArray.get(2).setBackground(Color.BLUE.brighter());
        labelArray.get(2).setForeground(Color.white);
        add(labelArray.get(2));
    }

}
