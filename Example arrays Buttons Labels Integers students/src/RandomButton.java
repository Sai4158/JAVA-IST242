
import java.awt.*;
import javax.swing.*;

public class RandomButton extends JButton
{

    int n;

    public RandomButton()
    {
        double r = Math.random();
        int myNumber = (int) (r * 11f); //comment: a random number between 0 and 10
        n = myNumber;
        setText("a random number " + n + " - see RandomButton.java class ");
    }

}
