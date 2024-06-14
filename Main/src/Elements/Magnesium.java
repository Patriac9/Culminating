package Elements;
import Core.*;
public class Magnesium extends Element{
    private Frame CurrentFrame;
    public Magnesium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        Category=3;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
        CurrentFrame.getContentPane().removeAll();
    }
}
