package Elements;

import Core.Frame;
public class Calcium extends Element{
    private Frame CurrentFrame;
    public Calcium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        Category=3;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();

    }
}
