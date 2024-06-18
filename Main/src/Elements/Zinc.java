package Elements;

import Core.Frame;

public class Zinc extends Element{
    public Zinc(Frame CurrentFrame){
        Category=4;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();
    }
}
