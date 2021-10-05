package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(d.width,d.height);
        this.setLayout(null);
        //this.pack();


        ImageIcon icon = new ImageIcon("logo.jpg");
        this.setIconImage(icon.getImage());
        MyLabel label = new MyLabel();
        this.add(label);
        MyLabel2 label2 = new MyLabel2();
        this.add(label2);
        this.setVisible(true);
    }
}
