package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    MyLabel(){
        this.setText("Michał is learning programming!");
        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(new Color(60,20,100),10);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setIcon(image);
        this.setFont(new Font("Calibri",Font.PLAIN,30));
        this.setBackground(new Color(0x10AA10));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        //this.setBorder(border);
        this.setForeground(Color.red);
        this.setBounds(0,0,(d.width/2),d.height-20);
    }
}
