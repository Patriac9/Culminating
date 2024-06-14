package Elements;

import Core.Frame;

import java.awt.*;

public class Rubidium extends Element{
    private Frame CurrentFrame;
    public Rubidium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        Category=2;
        baseColor=Element.setColor(Category);
        CurrentFrame.getContentPane().removeAll();
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
