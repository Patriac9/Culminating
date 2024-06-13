package Elements;

import Core.Frame;

import java.awt.*;

public class Sodium extends Element{
    private Frame CurrentFrame;
    public Sodium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        CurrentFrame.getContentPane().removeAll();
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
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
