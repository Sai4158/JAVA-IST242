package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Model.Model;
import View.View;

public class Controller implements KeyListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addKeyListenerToFrame(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            // Player 1 controls
            case KeyEvent.VK_W:
                model.movePlayer1Up();
                break;
            case KeyEvent.VK_S:
                model.movePlayer1Down();
                break;
            case KeyEvent.VK_A:
                model.movePlayer1Left();
                break;
            case KeyEvent.VK_D:
                model.movePlayer1Right();
                break;
            // Player 2 controls
            case KeyEvent.VK_UP:
                model.movePlayer2Up();
                break;
            case KeyEvent.VK_DOWN:
                model.movePlayer2Down();
                break;
            case KeyEvent.VK_LEFT:
                model.movePlayer2Left();
                break;
            case KeyEvent.VK_RIGHT:
                model.movePlayer2Right();
                break;
            // Player 3 controls
            case KeyEvent.VK_I:
                model.movePlayer3Up();
                break;
            case KeyEvent.VK_K:
                model.movePlayer3Down();
                break;
            case KeyEvent.VK_J:
                model.movePlayer3Left();
                break;
            case KeyEvent.VK_L:
                model.movePlayer3Right();
                break;
        }
        view.getIp().repaint(); // Repaint the panel to update the players' positions
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }
}