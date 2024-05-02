package View;
/**
 * Filename: CenterPanel.java
 * Short description: The panel that displays the data
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 4/5/2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

// displaying the data and headers
public class CenterPanel extends JPanel {

    // Buttons
    private ArrayList<JButton> headerButtons;

    private JPanel dataPanel;
    private ArrayList<ArrayList<String>> dataRows;
    private int firstLineToDisplay = 0;
    // Number of rows to display
    private final int visibleRowCount = 20;

    // takes headers and the data for rows
    public CenterPanel(ArrayList<String> headers, ArrayList<ArrayList<String>> dataRows) {
        setLayout(new BorderLayout());
        this.dataRows = dataRows;

        // the header panel with buttons
        JPanel headerPanel = createHeaderPanel(headers);
        add(headerPanel, BorderLayout.NORTH);

        // Setup the data panel
        dataPanel = new JPanel(new GridLayout(visibleRowCount, headers.size()));
        add(dataPanel, BorderLayout.CENTER);
        updateDataPanel();

        // Mouse wheel listener
        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int scrollAmount = e.getWheelRotation();
                firstLineToDisplay += scrollAmount;
                firstLineToDisplay = Math.max(0, Math.min(firstLineToDisplay, dataRows.size() - visibleRowCount));
                updateDataPanel();
            }
        });
    }

    // Creates the header panel
    private JPanel createHeaderPanel(ArrayList<String> headers) {
        JPanel headerPanel = new JPanel(new GridLayout(1, headers.size()));
        // Light gray
        //rgb
        headerPanel.setBackground(new Color(211, 211, 211));

        headerButtons = new ArrayList<>();
        for (String header : headers) {
            JButton headerButton = new JButton(header);
            // Default color
            headerButton.setBackground(Color.lightGray);
            headerButton.addActionListener(e -> {
                headerButtons.forEach(button -> button.setBackground(Color.lightGray));
                // color change for the clicked one
                headerButton.setBackground(Color.gray);
            });
            headerPanel.add(headerButton);
            headerButtons.add(headerButton);
        }
        return headerPanel;
    }

    // Updates the rows based on scrolling
    private void updateDataPanel() {
        dataPanel.removeAll();

        for (int i = firstLineToDisplay; i < firstLineToDisplay + visibleRowCount && i < dataRows.size(); i++) {
            for (String cell : dataRows.get(i)) {
                dataPanel.add(new JButton(cell));
            }
        }

        // Refresh the panel
        dataPanel.revalidate();
        dataPanel.repaint();
    }
}