package Elements;


import Core.Frame;

public class Barium extends Element{
    public Barium(Frame CurrentFrame){
        CurrentFrame.getContentPane().removeAll();
        Category=3;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
