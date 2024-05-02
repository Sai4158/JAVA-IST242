
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ffonseca
 */
class GamePanel extends JPanel
{

    private ArrayList<JButton> letterButtons;

    GamePanel()
    {
        super();
        setBackground(Color.pink);
    }

    public void createButtons(int n)
    {
        setLetterButtons(new ArrayList());
        removeAll();
        for (int i = 0; i < n; i++)
        {
            JButton jb = new JButton(" ");
            getLetterButtons().add(jb);
            add(jb);
            validate();
            repaint();
        }
    }

    public void displayButtons(ArrayList<String> guesses)
    {
        for (int i = 0; i < guesses.size(); i++)
        {
            getLetterButtons().get(i).setText(guesses.get(i));
            validate();
            repaint();
        }
    }

    public ArrayList<JButton> getLetterButtons()
    {
        return letterButtons;
    }

    public void setLetterButtons(ArrayList<JButton> letters)
    {
        this.letterButtons = new ArrayList();;
    }

}
