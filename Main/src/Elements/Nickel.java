package Elements;

import Core.Frame;

public class Nickel extends Element{
    public Nickel(Frame CurrentFrame){
        Category=4;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();
    }
}
