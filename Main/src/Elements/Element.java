package Elements;

import javax.swing.*;
import java.awt.*;

public class Element {
    public void Display(){}
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
            case 0: col=new Color(253, 232, 127);
                break;
            case 1: col=new Color(186, 149, 246);
                break;
            case 2:
                col=new Color(255, 153, 177);
                break;
            case 3:
                col=new Color(116, 216, 246);
                break;
            case 4://transit metal
                col=new Color(255, 176, 99);
                break;
            case 5://post Transit
                col=new Color(123, 126, 253);
                break;
            case 6:
                col=new Color(255, 67, 67)
        }
        return col;

    }

}
