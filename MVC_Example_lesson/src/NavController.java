
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ffonseca
 */
class NavController
{

    private NavModel model;
    private NavView view;

    NavController(NavModel model, NavView iview)
    {
        this.model = model;
        this.view = iview;
        newWordListener();
        newLetterListener();
    }

    private void newWordListener()
    {

        getView().getInitialframe().getInitialPanel().getTopPanel().getNewWordButton().addActionListener(
                new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                getModel().getWordData().getNewWord();
                getView().getInitialframe().getInitialPanel().getGamePanel().createButtons(getModel().getWordData().getWordLength());
                getView().getInitialframe().getInitialPanel().getGamePanel().requestFocusInWindow();
            }
        }
        );

    }

    private void newLetterListener()
    {
        getView().getInitialframe().getInitialPanel().getGamePanel().addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent evt)
            {
                //int kk = evt.getKeyCode();
                char ch = evt.getKeyChar();
                String s = String.valueOf(ch);
                System.out.println("Key pressed="+ch);
                getModel().getWordData().hasLetter(s);
                getView().getInitialframe().getInitialPanel().getGamePanel().displayButtons(getModel().getWordData().getGuesses());
            }
        }
        );
    }

    public NavModel getModel()
    {
        return model;
    }

    public void setModel(NavModel model)
    {
        this.model = model;
    }

    public NavView getView()
    {
        return view;
    }

    public void setView(NavView view)
    {
        this.view = view;
    }

}
