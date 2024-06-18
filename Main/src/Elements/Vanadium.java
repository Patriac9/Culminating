package Elements;

import Core.Frame;

public class Vanadium extends Element{
    public Vanadium(Frame CurrentFrame){
        Category=4;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();
    }
}
