package Elements;
import Core.Frame;
import Elements.*;
import javax.swing.*;
import java.awt.*;

public class MainPage {
    final private int LEN=55;
    final private int WID=73;
    final private int InitX=180;
    final private int InitY=260;
    final private int GapX=77;
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
    private JButton Mg;
    private JButton Ca;
    private JButton Sr;
    private JButton Ba;
    private JButton Ra;
    private JButton Cs;
    private JButton Sc;
    private JButton Ti;
    private JButton V;
    private JButton Cr;
    private JButton Mn;
    public MainPage(Frame OwnedFrame){
        CurrentFrame=OwnedFrame;
        CurrentFrame.getContentPane().setBackground(Color.BLACK);
        CurrentFrame.getContentPane().removeAll();
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

        Cs=new JButton("55 Cs");
        Cs.setFocusable(false);
        Cs.setForeground(Color.WHITE);
        Cs.setBackground(Color.GRAY);
        Cs.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cs.setBounds(InitX,InitY+GapY*5,WID,LEN);
        Cs.setMargin(new Insets(0,0,0,0));
        Cs.addActionListener(cs->new Caesium(CurrentFrame));

        Fr=new JButton("87 Fr");
        Fr.setFocusable(false);
        Fr.setForeground(Color.WHITE);
        Fr.setBackground(Color.GRAY);
        Fr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Fr.setBounds(InitX,InitY+GapY*6,WID,LEN);
        Fr.setMargin(new Insets(0,0,0,0));
        Fr.addActionListener(fr->new Francium(CurrentFrame));

        Be=new JButton("04 Be");
        Be.setFocusable(false);
        Be.setForeground(Color.WHITE);
        Be.setBackground(Color.GRAY);
        Be.setBounds(InitX+GapX,InitY+GapY,WID,LEN);
        Be.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Be.setMargin(new Insets(0,0,0,0));
        Be.addActionListener(be->new Berylium(CurrentFrame));
        Mg=new JButton("12 Mg");
        Mg.setFocusable(false);
        Mg.setForeground(Color.white);
        Mg.setBackground(Color.GRAY);
        Mg.setBounds(InitX+GapX,InitY+GapY*2,WID,LEN);
        Mg.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mg.setMargin(new Insets(0,0,0,0));
        Mg.addActionListener(mg->new Magnesium(CurrentFrame));

        Ca=new JButton("20 Ca");
        Ca.setFocusable(false);
        Ca.setForeground(Color.white);
        Ca.setBackground(Color.GRAY);
        Ca.setBounds(InitX+GapX,InitY+GapY*3,WID,LEN);
        Ca.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ca.setMargin(new Insets(0,0,0,0));
        Ca.addActionListener(ca->new Calcium(CurrentFrame));

        Sr=new JButton("38 Sr");
        Sr.setFocusable(false);
        Sr.setForeground(Color.white);
        Sr.setBackground(Color.GRAY);
        Sr.setBounds(InitX+GapX,InitY+GapY*4,WID,LEN);
        Sr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sr.setMargin(new Insets(0,0,0,0));
        Sr.addActionListener(sr->new Strongtium(CurrentFrame));

        Ba=new JButton("56 Ba");
        Ba.setFocusable(false);
        Ba.setForeground(Color.white);
        Ba.setBackground(Color.GRAY);
        Ba.setBounds(InitX+GapX,InitY+GapY*5,WID,LEN);
        Ba.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ba.setMargin(new Insets(0,0,0,0));

        Ra=new JButton("88 Ra");
        Ra.setFocusable(false);
        Ra.setForeground(Color.white);
        Ra.setBackground(Color.GRAY);
        Ra.setBounds(InitX+GapX,InitY+GapY*6,WID,LEN);
        Ra.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ra.setMargin(new Insets(0,0,0,0));

        Sc=new JButton("21 Sc");
        Sc.setFocusable(false);
        Sc.setForeground(Color.white);
        Sc.setBackground(Color.GRAY);
        Sc.setBounds(InitX+GapX*2,InitY+GapY*2,WID,LEN);
        Sc.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sc.setMargin(new Insets(0,0,0,0));

        Ti=new JButton("22 Ti");
        Ti.setFocusable(false);
        Ti.setForeground(Color.white);
        Ti.setBackground(Color.GRAY);
        Ti.setBounds(InitX+GapX*3,InitY+GapY*2,WID,LEN);
        Ti.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ti.setMargin(new Insets(0,0,0,0));

        V=new JButton("23 V");
        V.setFocusable(false);
        V.setForeground(Color.white);
        V.setBackground(Color.GRAY);
        V.setBounds(InitX+GapX*4,InitY+GapY*2,WID,LEN);
        V.setFont(new Font("Arial",H.getFont().getStyle(),17));
        V.setMargin(new Insets(0,0,0,0));

        Cr=new JButton("25 Cr");
        Cr.setFocusable(false);
        Cr.setForeground(Color.white);
        Cr.setBackground(Color.GRAY);
        Cr.setBounds(InitX+GapX*5,InitY+GapY*2,WID,LEN);
        Cr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cr.setMargin(new Insets(0,0,0,0));

        Mn=new JButton("26 Mn");
        Mn.setFocusable(false);
        Mn.setForeground(Color.white);
        Mn.setBackground(Color.GRAY);
        Mn.setBounds(InitX+GapX*6,InitY+GapY*2,WID,LEN);
        Mn.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mn.setMargin(new Insets(0,0,0,0));

        CurrentFrame.add(K);
        CurrentFrame.add(Na);
        CurrentFrame.add(Li);
        CurrentFrame.add(H);
        CurrentFrame.add(Rb);
        CurrentFrame.add(Fr);
        CurrentFrame.add(Be);
        CurrentFrame.add(Mg);
        CurrentFrame.add(Ca);
        CurrentFrame.add(Sr);
        CurrentFrame.add(Ba);
        CurrentFrame.add(Ra);
        CurrentFrame.add(Cs);
        CurrentFrame.add(Sc);
        CurrentFrame.add(Ti);
        CurrentFrame.add(V);
        CurrentFrame.add(Cr);
        CurrentFrame.add(Mn);

    }
}
