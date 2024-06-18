package Elements;

import Core.Frame;

public class Cobalt extends Element{
    public Cobalt(Frame CurrentFrame){
        Category=4;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();
    }
}
