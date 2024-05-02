package View;

import Model.Model;

public class View {
    private MainFrame mf;

    public View(Model model) {
        mf = new MainFrame(model);
    }

    public void addKeyListenerToFrame(java.awt.event.KeyListener listener) {
        mf.addKeyListener(listener);
    }

    public MainFrame getMf() {
        return mf;
    }

    public InitialPanel getIp() {
        return mf.getIp();
    }
}