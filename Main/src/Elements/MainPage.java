package Elements;
import Core.Frame;
import Elements.Hydrogen;
import javax.swing.*;
import java.awt.*;

public class MainPage {
    final private int LEN=55;
    final private int WID=73;
    private Frame CurrentFrame;
    private JButton H;
    public MainPage(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
                //Main Pages
        JLabel Head=new JLabel();
        Head.setText("Periodic table");
        Head.setFont(new Font("Serif",Font.BOLD,45));
        Head.setBounds(720,25,800,200);
        Head.setForeground(Color.WHITE);
        CurrentFrame.add(Head);
        this.Present();
    }
    public void Present(){
        H=new JButton("01 H");
        H.setFocusable(false);
        H.setBounds(100,100,WID,LEN);
        H.setForeground(Color.WHITE);
        H.setBackground(Color.GRAY);
        
        H.setFont(new Font("Arial",H.getFont().getStyle(),17));
        H.addActionListener(h->new Hydrogen());
        CurrentFrame.add(H);
    }
}
