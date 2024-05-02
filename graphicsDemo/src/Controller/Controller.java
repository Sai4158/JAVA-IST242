package Controller;

import Model.Model;
import View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Controller implements ActionListener {
    private Model model;
    private View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;
        initialize();
    }

    private void initialize() {
        // Example of setting text from the model to the view's button
        view.getMf().getIp().getCp().getJb1().setText(model.getS1());
        view.getMf().getIp().getCp().getJb1().setText(model.getS2());
        view.getMf().getIp().getCp().getJb1().setText(model.getS3());

        //add listener to the buttons
        view.getMf().getIp().getCp().getJb1().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton obj =  (JButton) e.getSource();
        Random rand =  new Random();
        int num = rand.nextInt() + 1 ;
        int find = obj.getText().indexOf(".");
        String s = obj.getText().substring(0, find +1);
        obj.setText(s + " - "+ num);



    }
}
