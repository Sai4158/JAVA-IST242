package View;

public class View {
    // Instance variables
    private MainFrame mf;

    public View() {
        mf = new MainFrame();
    }

    public MainFrame getMf() {
        return mf;
    }

    public void setMf(MainFrame mf) {
        this.mf = mf;
    }
}
