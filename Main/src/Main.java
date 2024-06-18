import javax.swing.*;
import java.awt.*;
import Core.Frame;
import Elements.MainPage;
/*
this program draw a periodic table with button
for this demo, users can click on these buttons
2024-06-18
Frank
 */
public class Main {
    static public Frame MainFrame;
    static final String TITLE="Periodic table";
    static final int Height=1200;
    static final int Width=1800;
    public static void main(String[] args) {
        ImageIcon originalIcon = new ImageIcon("Icon2.png");
        Image originalImage = originalIcon.getImage();

        // Scale the image to a new size as needed and improve quality
        Image newIconImage = originalImage.getScaledInstance(256, 256, Image.SCALE_SMOOTH);
        MainFrame=new Frame(TITLE,newIconImage,Color.BLACK,Width,Height,true,false);
        MainFrame.setLayout(new FlowLayout());
        MainPage mainPage=new MainPage(MainFrame);
        MainFrame.repaint();
    }
}