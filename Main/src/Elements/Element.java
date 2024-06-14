package Elements;

import javax.swing.*;
import java.awt.*;

public class Element {
    public final int Alkali=1;
    final int Alkaline=3;
    public JButton Back=new JButton("< Back");
    public int Category;
    public Color baseColor;
    public String EngName;
    public String LatinName;
    static public Color setColor(int Category){
        Color col=new Color(0,0,0);
        switch (Category){
            case 0: col=new Color(253, 205, 127);
                break;
            case 1: col=new Color(186, 149, 246);
                break;
            case 2:
                col=new Color(255, 153, 177);
                break;
            case 3:
                col=new Color(116, 216, 246);
        }
        return col;
    }
}
