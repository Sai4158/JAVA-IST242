package View;
/**
 * Filename: InitialPanel.java
 * Short description: The initial panel that contains CenterPanel
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

import Model.FootballPlayerData;

import javax.swing.*;
import java.awt.*;

public class InitialPanel extends JPanel {
    // Panel that displays the table data
    private CenterPanel centerPanel;
    private WestPanel wp;

    public InitialPanel() {
        // The data model to get the headers

        setLayout(new BorderLayout());
        setBackground(Color.gray);

        FootballPlayerData data = new FootballPlayerData();
        centerPanel = new CenterPanel(data.getHeaders(), data.getLines(0, data.getLinesBeingDisplayed()));
        add(centerPanel);
        wp = new WestPanel();
    }
}
