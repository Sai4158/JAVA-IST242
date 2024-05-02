package View;

import javax.swing.*;
import java.awt.*;

public class WestPanel extends JPanel {

    //instance varibles
    private JButton selection;
    private JButton merge;
    private JButton quick;

    public JButton getSelection() {
        return selection;
    }

    public JButton getMerge() {
        return merge;
    }

    public JButton getQuick() {
        return quick;
    }

    public WestPanel(){
        setLayout(new GridLayout(4,1,5,5));

        //create label
        JLabel label = new JLabel("Choose SORT Type", SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setBackground(Color.blue);
        label.setOpaque(true);

        add(label);

        //create the button
        selection = new JButton("Selection Sort");
        selection.setBackground(Color.lightGray);
        add(selection);

        //merger
        merge = new JButton("Merger Sort");
        merge.setForeground(Color.lightGray);
        merge.setBackground(Color.gray);
        merge.setOpaque(true);
        add(merge);

        quick = new JButton("Quick Sort");
        quick.setForeground(Color.lightGray);
        quick.setOpaque(true);
        add(quick);

    }
    //get methods

}
