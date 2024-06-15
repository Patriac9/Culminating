package Elements;
import Core.Frame;

public class Strongtium extends Element{
    private Frame CurrentFrame;
    public Strongtium(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        CurrentFrame.getContentPane().removeAll();
        Category=3;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
