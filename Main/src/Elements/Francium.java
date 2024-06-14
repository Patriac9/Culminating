package Elements;

import Core.Frame;

public class Francium extends Element{
    private Frame CurrentFrame;
    public Francium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        CurrentFrame.getContentPane().removeAll();
        Category=2;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);

    }
}
