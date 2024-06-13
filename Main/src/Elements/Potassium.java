package Elements;

import Core.Frame;

import java.awt.*;

public class Potassium extends Element{
    private Frame CurrentFrame;
    public Potassium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        Category=2;
        switch (Category){
            case 0: baseColor=new Color(253, 205, 127);
                break;
            case 1: baseColor=new Color(186, 149, 246);
                break;
            case 2:
                baseColor=new Color(253, 133, 160);
                break;
        }
        CurrentFrame.getContentPane().removeAll();
        CurrentFrame.getContentPane().setBackground(baseColor);

    }
}
