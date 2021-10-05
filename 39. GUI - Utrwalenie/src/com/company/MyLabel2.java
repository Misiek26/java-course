package com.company;

import javax.swing.*;
import java.awt.*;

public class MyLabel2 extends JLabel {
    MyLabel2(){
        ImageIcon image = new ImageIcon("logo.jpg");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setIcon(image);
        this.setText("Michał learned how to used labels in Java!");
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBackground(new Color(160,140,10));
        this.setOpaque(true);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("ROBOTO",Font.ITALIC,30));
        this.setBounds(d.width/2,0,d.width/2,d.height);
    }
}
