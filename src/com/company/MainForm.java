package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel panel1;
    private JButton button1;
    private JLabel label1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Screen");
        frame.setContentPane(new MainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
