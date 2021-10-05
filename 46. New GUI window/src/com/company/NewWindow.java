package com.company;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    NewWindow(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(label);
    }
}
