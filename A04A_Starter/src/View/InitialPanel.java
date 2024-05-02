package View;

import Model.Model;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InitialPanel extends JPanel {
    private Model model;

    public InitialPanel(Model model) {
        super();
        this.model = model;
        setBackground(Color.lightGray);

        JButton optionsButton = new JButton("Help");
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create the new window
                JFrame optionsFrame = new JFrame("View Controls");
                // set layout
                optionsFrame.setLayout(new GridLayout());
                optionsFrame.setSize(500, 200);
                optionsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Add some options to the new window
                JTextPane keybinds = new JTextPane();
                keybinds.setText("Keybinds: \n" +
                        "Player 1: W, A, S, D\n" +
                        "Player 2: UP, DOWN, LEFT, RIGHT\n" +
                        "Player 3: I, J, K, L\n");
                keybinds.setEditable(false);

                optionsFrame.add(keybinds);

                // Show the new window
                optionsFrame.setVisible(true);
            }
        });

        optionsButton.setFocusable(false); // Make the button non-focusable

        // Add the button to the panel
        add(optionsButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the square
        model.getPlayer1().draw(g);
        model.getPlayer2().draw(g);
        model.getPlayer3().draw(g);
    }
}