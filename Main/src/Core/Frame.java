package Core;

import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
    public Frame(String Title, Image icon, Color InitColor, int Width, int Height, boolean bCmdShow,boolean bAllowResize){
        this.setTitle(Title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Width,Height);


        // Set the new scaled image as the icon
        this.setIconImage(icon);
        this.getContentPane().setBackground(InitColor);
        this.setResizable(bAllowResize);
        this.setVisible(bCmdShow);
    }
}
