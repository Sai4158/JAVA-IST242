package View;
/*
 * Filename: View.java
 * Short description: GUI components of the MVC application.
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */
import View.InitialPanel;

public class View
{

    private MainFrame mainFrame;

    public View()
    {
        mainFrame  = new MainFrame();
    }

    /**
     * @return the mf
     */
    public InitialPanel getInitialPanel() {
        return mainFrame.getInitialPanel();
    }

    /**
     * @param mf the mainFrame to set
     */
    public void setMf(MainFrame mf)
    {
        this.mainFrame  = mf;
    }


}
