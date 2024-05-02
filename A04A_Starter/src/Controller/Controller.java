package Controller;
/*
 * Filename: Controller.java
 * Short description: Model and View, listens to user input and updates the view
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

 // Model's data handling
public class Controller {
        private Model model;
        private View view;

    public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
            setupButtonListeners();
    }
        // Action listeners for the buttons in the view
        private void setupButtonListeners() {
            // Get the buttons from the view's initial panel
            JButton button1 = view.getInitialPanel().getButton1();
            JButton button2 = view.getInitialPanel().getButton2();
            JButton button3 = view.getInitialPanel().getButton3();

            // Action listener to button1
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Update student info when button is clicked
                    String updatedInfo = model.updateStudentCredits(0);
                    view.getInitialPanel().setButtonInfo(updatedInfo, 0);
                }
            });

            // Action listener to button2
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String updatedInfo = model.updateStudentCredits(1);
                    view.getInitialPanel().setButtonInfo(updatedInfo, 1);
                }
            });

            // Action listener to button3
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String updatedInfo = model.updateStudentCredits(2);
                    view.getInitialPanel().setButtonInfo(updatedInfo, 2);
                }
            });
        }
    }
