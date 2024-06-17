package Elements;

import Core.*;
public class Radium extends Element{
    public Radium(Frame CurrentFrame){
        CurrentFrame.getContentPane().removeAll();
        Category=3;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
