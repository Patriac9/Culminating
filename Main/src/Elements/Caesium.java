package Elements;

import Core.*;
public class Caesium extends Element{
    private Frame CurrentFrame;
    public Caesium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        CurrentFrame.getContentPane().removeAll();
        Category=2;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
