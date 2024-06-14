package Elements;

import Core.Frame;

public class Berylium extends Element{
    private Frame CurrentFrame;
    public Berylium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        Category=3;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().removeAll();
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
