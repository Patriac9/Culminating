package Elements;
import Core.*;
import Core.Frame;

import java.awt.*;

public class Hydrogen extends Element{
    private Frame CurrentFrame;
    public Hydrogen(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        CurrentFrame.getContentPane().removeAll();
        Category=0;
        baseColor=setColor(Category);
        CurrentFrame.getContentPane().setBackground(baseColor);
    }
}
