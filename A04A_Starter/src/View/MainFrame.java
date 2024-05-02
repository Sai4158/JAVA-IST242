package View;

import Model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private InitialPanel ip;
    private JLabel roundTimer;
    private int timeLeft = 300;

    public MainFrame(Model model) {
        super("Freeze Tag");

        ip = new InitialPanel(model);
        add(ip);

        // Title UI
        JLabel title = new JLabel("Freeze Tag v.0.1 - ");
        title.setFont(title.getFont().deriveFont(20.0f));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        // Initialize the instance variable roundTimer, not a local variable
        roundTimer = new JLabel("Timer: 5:00");
        roundTimer.setFont(roundTimer.getFont().deriveFont(20.0f));
        roundTimer.setHorizontalAlignment(SwingConstants.RIGHT);

        ip.add(title);
        ip.add(roundTimer);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);

        startTimer();
    }

    private void startTimer() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                int minutes = timeLeft / 60;
                int seconds = timeLeft % 60;
                roundTimer.setText(String.format("Timer: %02d:%02d", minutes, seconds));
                if (timeLeft <= 0) {
                    ((Timer)e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    public InitialPanel getIp() {
        return ip;
    }
}