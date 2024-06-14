package Elements;
import Core.Frame;
import Elements.*;
import javax.swing.*;
import java.awt.*;

public class MainPage {
    final private int LEN=55;
    final private int WID=73;
    final private int InitX=110;
    final private int InitY=200;
    final private int GapX=73;
    final private int GapY=60;
    private Frame CurrentFrame;
    private JButton Li;
    private JButton H;
    private JButton He;
    private JButton Na;
    private JButton K;
    private JButton Rb;
    private JButton Fr;
    private JButton Be;
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
        H.setBounds(InitX,InitY,WID,LEN);
        H.setForeground(Color.WHITE);
        H.setBackground(Color.GRAY);
        H.setFont(new Font("Arial",H.getFont().getStyle(),17));
        H.addActionListener(h->new Hydrogen(CurrentFrame));

        Li=new JButton("03 Li");
        Li.setFocusable(false);
        Li.setForeground(Color.WHITE);
        Li.setBackground(Color.GRAY);
        Li.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Li.setBounds(InitX,InitY+GapY,WID,LEN);
        Li.addActionListener(li->new Lithium(CurrentFrame));

        Na=new JButton("11 Na");
        Na.setFocusable(false);
        Na.setForeground(Color.WHITE);
        Na.setBackground(Color.GRAY);
        Na.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Na.setBounds(InitX,InitY+GapY*2,WID,LEN);
        Na.setMargin(new Insets(0,0,0,0));
        Na.addActionListener(na->new Sodium(CurrentFrame));

        K=new JButton("19 K");
        K.setFocusable(false);
        K.setForeground(Color.WHITE);
        K.setBackground(Color.GRAY);
        K.setFont(new Font("Arial",H.getFont().getStyle(),17));
        K.setBounds(InitX,InitY+GapY*3,WID,LEN);
        K.addActionListener(k->new Potassium(CurrentFrame));

        Rb=new JButton("37 Rb");
        Rb.setFocusable(false);
        Rb.setForeground(Color.WHITE);
        Rb.setBackground(Color.GRAY);
        Rb.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Rb.setBounds(InitX,InitY+GapY*4,WID,LEN);
        Rb.setMargin(new Insets(0,0,0,0));
        Rb.addActionListener(rb->new Rubidium(CurrentFrame));

        Fr=new JButton("87 Fr");
        Fr.setFocusable(false);
        Fr.setForeground(Color.WHITE);
        Fr.setBackground(Color.GRAY);
        Fr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Fr.setBounds(InitX,InitY+GapY*5,WID,LEN);
        Fr.setMargin(new Insets(0,0,0,0));
        Be=new JButton("04 Be");
        Be.setFocusable(false);
        CurrentFrame.add(K);
        CurrentFrame.add(Na);
        CurrentFrame.add(Li);
        CurrentFrame.add(H);
        CurrentFrame.add(Rb);
        CurrentFrame.add(Fr);
        CurrentFrame.add(Be);
    }
}
