
import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel
{

    private TopPanel top;
    private GamePanel game;

    public InitialPanel()
    {
        super();
        setBackground(Color.yellow);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        top = new TopPanel();
        game = new GamePanel();
        add(top, BorderLayout.NORTH);
        add(game, BorderLayout.CENTER);
    }

    public TopPanel getTopPanel()
    {
        return top;
    }

    public void setTopPanel(TopPanel tp)
    {
        this.top = tp;
    }

    public GamePanel getGamePanel()
    {
        return game;
    }

    public void setGamePanel(GamePanel gp)
    {
        this.game = gp;
    }

}
