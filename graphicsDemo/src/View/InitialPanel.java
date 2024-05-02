package View;

import javax.swing.*;
import java.awt.*;

public class InitialPanel extends JPanel {
    private CenterPanel cp;

    public InitialPanel() {
        setLayout(new BorderLayout());
        cp = new CenterPanel();
        add(cp, BorderLayout.CENTER);
    }

    public CenterPanel getCp() {
        return cp;
    }

    public void setCp(CenterPanel cp) {
        this.cp = cp;
    }
}
