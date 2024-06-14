package Elements;
import Core.*;
import Core.Frame;

import java.awt.*;

public class Helium extends Element{
    private Frame CurrentFrame;
    public Helium(Frame OwnedFrame){
        Category=1;
        CurrentFrame=OwnedFrame;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().removeAll();
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
