
import java.awt.Color;
import java.awt.GridLayout;
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
class TopPanel extends JPanel
{

    private JButton newWordButton;

    TopPanel()
    {
        super();
        setBackground(Color.yellow);
        newWordButton = new JButton("new word");
        add(newWordButton);
    }

    public JButton getNewWordButton()
    {
        return newWordButton;
    }

    public void setNewWordButton(JButton newWord)
    {
        this.newWordButton = newWord;
    }

}
