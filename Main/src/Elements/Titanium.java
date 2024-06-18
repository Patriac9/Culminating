package Elements;

import Core.Frame;

public class Titanium extends Element{
    public Titanium(Frame CurrentFrame){
        Category=4;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();
    }
}
