package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //MyFrame myFrame = new MyFrame();
        ImageIcon image = new ImageIcon("logo.png");
        ImageIcon icon = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Michał, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x12AAFF));
        label.setFont(new Font("Times New Roman",Font.PLAIN,30));
        label.setIconTextGap(10);
        label.setBackground(new Color(0x000000));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,400,400);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        //frame.setResizable(false);
        frame.add(label);
        frame.pack();

    }
}
