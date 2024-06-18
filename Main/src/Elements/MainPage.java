package Elements;
import Core.Frame;
import Elements.*;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.GRAY;
import static java.awt.Color.WHITE;

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
    private JButton Fe;
    private JButton Co;
    private JButton Ni;
    private JButton Cu;
    JButton Zn;
    JButton Ga;
    JButton Ge;
    JButton As;
    JButton Se;
    JButton Br;
    JButton Kr;
    JButton B;
    JButton C;
    JButton N;
    JButton O;
    JButton F;
    JButton Ne;
    JButton Al;
    JButton Si;
    JButton P;
    JButton S;
    JButton Cl;
    JButton Ar;
    JButton Y;
    JButton Zr;
    JButton Nb;
    JButton Mo;
    JButton Tc;
    JButton Ru;
    JButton Rh;
    JButton Pd;
    JButton Ag;
    JButton Cd;
    JButton In;
    JButton Sn;
    JButton Sb;
    JButton Te;
    JButton I;
    JButton Xe;
    JButton Hf;
    JButton Ta;
    JButton W;
    JButton Re;
    JButton Os;
    JButton Ir;
    JButton Pt;
    JButton Au;
    JButton Hg;
    JButton Tl;
    JButton Pb;
    JButton Bi;
    JButton Po;
    JButton At;
    JButton Rn;
    JButton Rf;
    JButton Db;
    JButton Sg;
    JButton Bh;
    JButton Hs;
    JButton Mt;
    JButton Ds;
    JButton Rg;
    JButton Cn;
    JButton Nh;
    JButton Fl;
    JButton Mc;
    JButton Lv;
    JButton Ts;
    JButton Og;

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
        H.setBackground(GRAY);
        H.setFont(new Font("Arial",H.getFont().getStyle(),17));
        H.addActionListener(h->new Hydrogen(CurrentFrame));

        Li=new JButton("03 Li");
        Li.setFocusable(false);
        Li.setForeground(Color.WHITE);
        Li.setBackground(GRAY);
        Li.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Li.setBounds(InitX,InitY+GapY,WID,LEN);
        Li.addActionListener(li->new Lithium(CurrentFrame));

        Na=new JButton("11 Na");
        Na.setFocusable(false);
        Na.setForeground(Color.WHITE);
        Na.setBackground(GRAY);
        Na.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Na.setBounds(InitX,InitY+GapY*2,WID,LEN);
        Na.setMargin(new Insets(0,0,0,0));
        Na.addActionListener(na->new Sodium(CurrentFrame));

        K=new JButton("19 K");
        K.setFocusable(false);
        K.setForeground(Color.WHITE);
        K.setBackground(GRAY);
        K.setFont(new Font("Arial",H.getFont().getStyle(),17));
        K.setBounds(InitX,InitY+GapY*3,WID,LEN);
        K.addActionListener(k->new Potassium(CurrentFrame));

        Rb=new JButton("37 Rb");
        Rb.setFocusable(false);
        Rb.setForeground(Color.WHITE);
        Rb.setBackground(GRAY);
        Rb.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Rb.setBounds(InitX,InitY+GapY*4,WID,LEN);
        Rb.setMargin(new Insets(0,0,0,0));
        Rb.addActionListener(rb->new Rubidium(CurrentFrame));

        Cs=new JButton("55 Cs");
        Cs.setFocusable(false);
        Cs.setForeground(Color.WHITE);
        Cs.setBackground(GRAY);
        Cs.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cs.setBounds(InitX,InitY+GapY*5,WID,LEN);
        Cs.setMargin(new Insets(0,0,0,0));
        Cs.addActionListener(cs->new Caesium(CurrentFrame));

        Fr=new JButton("87 Fr");
        Fr.setFocusable(false);
        Fr.setForeground(Color.WHITE);
        Fr.setBackground(GRAY);
        Fr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Fr.setBounds(InitX,InitY+GapY*6,WID,LEN);
        Fr.setMargin(new Insets(0,0,0,0));
        Fr.addActionListener(fr->new Francium(CurrentFrame));

        Be=new JButton("04 Be");
        Be.setFocusable(false);
        Be.setForeground(Color.WHITE);
        Be.setBackground(GRAY);
        Be.setBounds(InitX+GapX,InitY+GapY,WID,LEN);
        Be.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Be.setMargin(new Insets(0,0,0,0));
        Be.addActionListener(be->new Berylium(CurrentFrame));
        Mg=new JButton("12 Mg");
        Mg.setFocusable(false);
        Mg.setForeground(Color.white);
        Mg.setBackground(GRAY);
        Mg.setBounds(InitX+GapX,InitY+GapY*2,WID,LEN);
        Mg.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mg.setMargin(new Insets(0,0,0,0));
        Mg.addActionListener(mg->new Magnesium(CurrentFrame));

        Ca=new JButton("20 Ca");
        Ca.setFocusable(false);
        Ca.setForeground(Color.white);
        Ca.setBackground(GRAY);
        Ca.setBounds(InitX+GapX,InitY+GapY*3,WID,LEN);
        Ca.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ca.setMargin(new Insets(0,0,0,0));
        Ca.addActionListener(ca->new Calcium(CurrentFrame));

        Sr=new JButton("38 Sr");
        Sr.setFocusable(false);
        Sr.setForeground(Color.white);
        Sr.setBackground(GRAY);
        Sr.setBounds(InitX+GapX,InitY+GapY*4,WID,LEN);
        Sr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sr.setMargin(new Insets(0,0,0,0));
        Sr.addActionListener(sr->new Strongtium(CurrentFrame));

        Ba=new JButton("56 Ba");
        Ba.setFocusable(false);
        Ba.setForeground(Color.white);
        Ba.setBackground(GRAY);
        Ba.setBounds(InitX+GapX,InitY+GapY*5,WID,LEN);
        Ba.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ba.setMargin(new Insets(0,0,0,0));
        Ba.addActionListener(ba->new Barium(CurrentFrame));

        Ra=new JButton("88 Ra");
        Ra.setFocusable(false);
        Ra.setForeground(Color.white);
        Ra.setBackground(GRAY);
        Ra.setBounds(InitX+GapX,InitY+GapY*6,WID,LEN);
        Ra.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ra.setMargin(new Insets(0,0,0,0));
        Ra.addActionListener(ra->new Radium(CurrentFrame));

        Sc=new JButton("21 Sc");
        Sc.setFocusable(false);
        Sc.setForeground(Color.white);
        Sc.setBackground(GRAY);
        Sc.setBounds(InitX+GapX*2,InitY+GapY*3,WID,LEN);
        Sc.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sc.setMargin(new Insets(0,0,0,0));
        Sc.addActionListener(sc->new Scandium(CurrentFrame));

        Ti=new JButton("22 Ti");
        Ti.setFocusable(false);
        Ti.setForeground(Color.white);
        Ti.setBackground(GRAY);
        Ti.setBounds(InitX+GapX*3,InitY+GapY*3,WID,LEN);
        Ti.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ti.setMargin(new Insets(0,0,0,0));
        Ti.addActionListener(ti->new Titanium(CurrentFrame));

        V=new JButton("23 V");
        V.setFocusable(false);
        V.setForeground(Color.white);
        V.setBackground(GRAY);
        V.setBounds(InitX+GapX*4,InitY+GapY*3,WID,LEN);
        V.setFont(new Font("Arial",H.getFont().getStyle(),17));
        V.setMargin(new Insets(0,0,0,0));
        V.addActionListener(v->new Vanadium(CurrentFrame));

        Cr=new JButton("25 Cr");
        Cr.setFocusable(false);
        Cr.setForeground(Color.white);
        Cr.setBackground(GRAY);
        Cr.setBounds(InitX+GapX*5,InitY+GapY*3,WID,LEN);
        Cr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cr.setMargin(new Insets(0,0,0,0));
        Cr.addActionListener(cr->new Chromium(CurrentFrame));

        Mn=new JButton("26 Mn");
        Mn.setFocusable(false);
        Mn.setForeground(Color.white);
        Mn.setBackground(GRAY);
        Mn.setBounds(InitX+GapX*6,InitY+GapY*3,WID,LEN);
        Mn.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mn.setMargin(new Insets(0,0,0,0));

        Fe=new JButton("27 Fe");
        Fe.setFocusable(false);
        Fe.setForeground(Color.white);
        Fe.setBackground(GRAY);
        Fe.setBounds(InitX+GapX*7,InitY+GapY*3,WID,LEN);
        Fe.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Fe.setMargin(new Insets(0,0,0,0));
        Fe.addActionListener(fe->new Iron(CurrentFrame));

        Co=new JButton("Co 28");
        Co.setFocusable(false);
        Co.setForeground(Color.white);
        Co.setBackground(GRAY);
        Co.setBounds(InitX+GapX*8,InitY+GapY*3,WID,LEN);
        Co.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Co.setMargin(new Insets(0,0,0,0));
        Co.addActionListener(co->new Cobalt(CurrentFrame));

        Ni=new JButton("Ni 29");
        Ni.setFocusable(false);
        Ni.setForeground(Color.white);
        Ni.setBackground(GRAY);
        Ni.setBounds(InitX+GapX*9,InitY+GapY*3,WID,LEN);
        Ni.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ni.setMargin(new Insets(0,0,0,0));
        Ni.addActionListener(ni->new Nickel(CurrentFrame));

        Cu=new JButton("Cu 30");
        Cu.setFocusable(false);
        Cu.setForeground(Color.white);
        Cu.setBackground(GRAY);
        Cu.setBounds(InitX+GapX*10,InitY+GapY*3,WID,LEN);
        Cu.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cu.setMargin(new Insets(0,0,0,0));
        Cu.addActionListener(cu->new Copper(CurrentFrame));

        Zn=new JButton("Sn 31");
        Zn.setFocusable(false);
        Zn.setForeground(Color.white);
        Zn.setBackground(GRAY);
        Zn.setBounds(InitX+GapX*11,InitY+GapY*3,WID,LEN);
        Zn.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Zn.setMargin(new Insets(0,0,0,0));
        Zn.addActionListener(zn->new Zinc(CurrentFrame));

        Ga= new JButton("Ga 32");
        Ga.setFocusable(false);
        Ga.setForeground(Color.white);
        Ga.setBackground(GRAY);
        Ga.setBounds(InitX+GapX*12,InitY+GapY*3,WID,LEN);
        Ga.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ga.setMargin(new Insets(0,0,0,0));

        Ge= new JButton("Ge 33");
        Ge.setFocusable(false);
        Ge.setForeground(Color.white);
        Ge.setBackground(GRAY);
        Ge.setBounds(InitX+GapX*13,InitY+GapY*3,WID,LEN);
        Ge.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ge.setMargin(new Insets(0,0,0,0));

        As=new JButton("As 34");
        As.setFocusable(false);
        As.setForeground(Color.white);
        As.setBackground(GRAY);
        As.setBounds(InitX+GapX*14,InitY+GapY*3,WID,LEN);
        As.setFont(new Font("Arial",H.getFont().getStyle(),17));
        As.setMargin(new Insets(0,0,0,0));

        Se=new JButton("Se 35");
        Se.setFocusable(false);
        Se.setForeground(Color.white);
        Se.setBackground(GRAY);
        Se.setBounds(InitX+GapX*15,InitY+GapY*3,WID,LEN);
        Se.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Se.setMargin(new Insets(0,0,0,0));

        Br=new JButton("Br 36");
        Br.setFocusable(false);
        Br.setForeground(Color.white);
        Br.setBackground(GRAY);
        Br.setBounds(InitX+GapX*16,InitY+GapY*3,WID,LEN);
        Br.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Br.setMargin(new Insets(0,0,0,0));

        He=new JButton("He 02");
        He.setFocusable(false);
        He.setForeground(Color.white);
        He.setBackground(GRAY);
        He.setBounds(InitX+GapX*17,InitY,WID,LEN);
        He.setFont(new Font("Arial",H.getFont().getStyle(),17));
        He.setMargin(new Insets(0,0,0,0));
        He.addActionListener(he->new Helium(CurrentFrame));

        Kr=new JButton("Kr 37");
        Kr.setFocusable(false);
        Kr.setForeground(Color.white);
        Kr.setBackground(GRAY);
        Kr.setBounds(InitX+GapX*17,InitY+GapY*3,WID,LEN);
        Kr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Kr.setMargin(new Insets(0,0,0,0));
        B= new JButton("B 05");
        B.setFocusable(false);
        B.setForeground(Color.white);
        B.setBackground(GRAY);
        B.setBounds(InitX+GapX*12,InitY+GapY,WID,LEN);
        B.setFont(new Font("Arial",H.getFont().getStyle(),17));
        B.setMargin(new Insets(0,0,0,0));

        C=new JButton("C 06");
        C.setFocusable(false);
        C.setForeground(Color.white);
        C.setBackground(GRAY);
        C.setBounds(InitX+GapX*13,InitY+GapY,WID,LEN);
        C.setFont(new Font("Arial",H.getFont().getStyle(),17));
        C.setMargin(new Insets(0,0,0,0));

        N=new JButton("N 07");
        N.setFocusable(false);
        N.setForeground(Color.white);
        N.setBackground(GRAY);
        N.setBounds(InitX+GapX*14,InitY+GapY,WID,LEN);
        N.setFont(new Font("Arial",H.getFont().getStyle(),17));
        N.setMargin(new Insets(0,0,0,0));

        O=new JButton("O 08");
        O.setFocusable(false);
        O.setForeground(Color.white);
        O.setBackground(GRAY);
        O.setBounds(InitX+GapX*15,InitY+GapY,WID,LEN);
        O.setFont(new Font("Arial",H.getFont().getStyle(),17));
        O.setMargin(new Insets(0,0,0,0));

        F=new JButton("F 09");
        F.setFocusable(false);
        F.setForeground(Color.white);
        F.setBackground(GRAY);
        F.setBounds(InitX+GapX*16,InitY+GapY,WID,LEN);
        F.setFont(new Font("Arial",H.getFont().getStyle(),17));
        F.setMargin(new Insets(0,0,0,0));

        Ne=new JButton("Ne 10");
        Ne.setFocusable(false);
        Ne.setForeground(Color.white);
        Ne.setBackground(GRAY);
        Ne.setBounds(InitX+GapX*17,InitY+GapY,WID,LEN);
        Ne.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ne.setMargin(new Insets(0,0,0,0));

        Al=new JButton("Al 13");
        Al.setFocusable(false);
        Al.setForeground(Color.white);
        Al.setBackground(GRAY);
        Al.setBounds(InitX+GapX*12,InitY+GapY*2,WID,LEN);
        Al.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Al.setMargin(new Insets(0,0,0,0));

        Si=new JButton("Si 14");
        Si.setFocusable(false);
        Si.setForeground(Color.white);
        Si.setBackground(Color.GRAY);
        Si.setBounds(InitX+GapX*13,InitY+GapY*2,WID,LEN);
        Si.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Si.setMargin(new Insets(0,0,0,0));

        P=new JButton("P 15");
        P.setFocusable(false);
        P   .setForeground(Color.white);
        P   .setBackground(GRAY);
        P.setBounds(InitX+GapX*14,InitY+GapY*2,WID,LEN);
        P.setFont(new Font("Arial",H.getFont().getStyle(),17));
        P.setMargin(new Insets(0,0,0,0));

        S=new JButton("S 16");
        S.setFocusable(false);
        S.setForeground(Color.white);
        S.setBackground(Color.GRAY);
        S.setBounds(InitX+GapX*15,InitY+GapY*2,WID,LEN);
        S.setFont(new Font("Arial",H.getFont().getStyle(),17));
        S.setMargin(new Insets(0,0,0,0));

        Cl=new JButton("Cl 17");
        Cl.setFocusable(false);
        Cl.setForeground(Color.white);
        Cl.setBackground(Color.GRAY);
        Cl.setBounds(InitX+GapX*16,InitY+GapY*2,WID,LEN);
        Cl.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cl.setMargin(new Insets(0,0,0,0));

        Ar=new JButton("Ar 18");
        Ar.setFocusable(false);
        Ar.setForeground(Color.white);
        Ar.setBackground(Color.GRAY);
        Ar.setBounds(InitX+GapX*17,InitY+GapY*2,WID,LEN);
        Ar.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ar.setMargin(new Insets(0,0,0,0));

        Y=new JButton("Y 39");
        Y.setFocusable(false);
        Y.setForeground(Color.white);
        Y.setBackground(Color.GRAY);
        Y.setBounds(InitX+GapX*2,InitY+GapY*4,WID,LEN);
        Y.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Y.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Y);

        Zr=new JButton("Zr 40");
        Zr.setFocusable(false);
        Zr.setForeground(Color.white);
        Zr.setBackground(Color.GRAY);
        Zr.setBounds(InitX+GapX*3,InitY+GapY*4,WID,LEN);
        Zr.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Zr.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Zr);
        Nb=new JButton("Nb 41");
        Nb.setFocusable(false);
        Nb.setForeground(Color.white);
        Nb.setBackground(Color.GRAY);
        Nb.setBounds(InitX+GapX*4,InitY+GapY*4,WID,LEN);
        Nb.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Nb.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Nb);
        Mo=new JButton("Mo 42");
        Mo.setFocusable(false);
        Mo.setForeground(Color.white);
        Mo.setBackground(Color.GRAY);
        Mo.setBounds(InitX+GapX*5,InitY+GapY*4,WID,LEN);
        Mo.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mo.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Mo);
        Tc=new JButton("Tc 43");
        Tc.setFocusable(false);
        Tc.setForeground(Color.white);
        Tc.setBackground(Color.GRAY);
        Tc.setBounds(InitX+GapX*6,InitY+GapY*4,WID,LEN);
        Tc.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Tc.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Tc);

        Ru=new JButton("Ru 44");
        Ru.setFocusable(false);
        Ru.setForeground(Color.white);
        Ru.setBackground(Color.GRAY);
        Ru.setBounds(InitX+GapX*7,InitY+GapY*4,WID,LEN);
        Ru.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ru.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Ru);
        Rh=new JButton("Rh 45");
        Rh.setFocusable(false);
        Rh.setForeground(Color.white);
        Rh.setBackground(Color.GRAY);
        Rh.setBounds(InitX+GapX*8,InitY+GapY*4,WID,LEN);
        Rh.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Rh.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Rh);

        Pd=new JButton("Pd 46");
        Pd.setFocusable(false);
        Pd.setForeground(Color.white);
        Pd.setBackground(Color.GRAY);
        Pd.setBounds(InitX+GapX*9,InitY+GapY*4,WID,LEN);
        Pd.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Pd.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Pd);

        Ag=new JButton("Ag 47");
        Ag.setFocusable(false);
        Ag.setForeground(Color.white);
        Ag.setBackground(Color.GRAY);
        Ag.setBounds(InitX+GapX*10,InitY+GapY*4,WID,LEN);
        Ag.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ag.setMargin(new Insets(0,0,0,0));

        Cd=new JButton("Cd 48");
        Cd.setFocusable(false);
        Cd.setForeground(Color.white);
        Cd.setBackground(Color.GRAY);
        Cd.setBounds(InitX+GapX*11,InitY+GapY*4,WID,LEN);
        Cd.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cd.setMargin(new Insets(0,0,0,0));

        CurrentFrame.add(Cd);

        In=new JButton("In 49");
        In.setFocusable(false);
        In  .setForeground(Color.white);
        In.setBackground(Color.GRAY);
        In.setBounds(InitX+GapX*12,InitY+GapY*4,WID,LEN);
        In.setFont(new Font("Arial",H.getFont().getStyle(),17));
        In.setMargin(new Insets(0,0,0,0));

        CurrentFrame.add(In);

        Sn=new JButton("Sn 50");
        Sn.setFocusable(false);
        Sn.setForeground(Color.white);
        Sn.setBackground(Color.GRAY);
        Sn.setBounds(InitX+GapX*13,InitY+GapY*4,WID,LEN);
        Sn.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sn.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Sn);

        Sb=new JButton("Sb 51");
        Sb.setFocusable(false);
        Sb.setForeground(Color.white);
        Sb.setBackground(Color.GRAY);
        Sb.setBounds(InitX+GapX*14,InitY+GapY*4,WID,LEN);
        Sb.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sb.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Sb);

        Te=new JButton("Te 52");
        Te.setFocusable(false);
        Te.setForeground(Color.white);
        Te.setBackground(Color.GRAY);
        Te.setBounds(InitX+GapX*15,InitY+GapY*4,WID,LEN);
        Te.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Te.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Te);

        I=new JButton("I 53");
        I.setFocusable(false);
        I.setForeground(Color.white);
        I.setBackground(Color.GRAY);
        I.setBounds(InitX+GapX*16,InitY+GapY*4,WID,LEN);
        I.setFont(new Font("Arial",H.getFont().getStyle(),17));
        I.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(I);

        Xe=new JButton("Xe 54");
        Xe.setFocusable(false);
        Xe.setForeground(Color.white);
        Xe.setBackground(Color.GRAY);
        Xe.setBounds(InitX+GapX*17,InitY+GapY*4,WID,LEN);
        Xe.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Xe.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Xe);

        Hf=new JButton("72 Hf");
        Hf.setFocusable(false);
        Hf.setForeground(Color.white);
        Hf.setBackground(Color.GRAY);
        Hf.setBounds(InitX+GapX*3,InitY+GapY*5,WID,LEN);
        Hf.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Hf.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Hf);

        Ta=new JButton("73 Hf");
        Ta.setFocusable(false);
        Ta.setForeground(Color.white);
        Ta.setBackground(Color.GRAY);
        Ta.setBounds(InitX+GapX*4,InitY+GapY*5,WID,LEN);
        Ta.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ta.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Ta);

        W=new JButton("74 W");
        W.setFocusable(false);
        W.setForeground(WHITE);
        W.setBackground(GRAY);
        W.setFont(new Font("Arial",H.getFont().getStyle(),17));
        W.setBounds(InitX+GapX*5,InitY+GapY*5,WID,LEN);
        W.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(W);

        Re=new JButton("75 Re");
        Re.setFocusable(false);
        Re.setForeground(WHITE);
        Re.setBackground(GRAY);
        Re.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Re.setBounds(InitX+GapX*6,InitY+GapY*5,WID,LEN);
        Re.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Re);

        Os=new JButton("76 Os");
        Os.setFocusable(false);
        Os.setForeground(WHITE);
        Os.setBackground(GRAY);
        Os.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Os.setBounds(InitX+GapX*7,InitY+GapY*5,WID,LEN);
        Os.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Os);

        Ir=new JButton("77 Ir");
        Ir.setFocusable(false);
        Ir.setForeground(WHITE);
        Ir.setBackground(GRAY);
        Ir.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ir.setBounds(InitX+GapX*8,InitY+GapY*5,WID,LEN);
        Ir.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Ir);

        Pt=new JButton("78 Pt");
        Pt.setFocusable(false);
        Pt.setForeground(WHITE);
        Pt.setBackground(GRAY);
        Pt.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Pt.setBounds(InitX+GapX*9,InitY+GapY*5,WID,LEN);
        Pt.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Pt);
        Au=new JButton("79 Au");
        Au.setFocusable(false);
        Au.setForeground(WHITE);
        Au.setBackground(GRAY);
        Au.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Au.setBounds(InitX+GapX*10,InitY+GapY*5,WID,LEN);
        Au.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Au);

        Hg=new JButton("80 Hg");
        Hg.setFocusable(false);
        Hg.setForeground(WHITE);
        Hg.setBackground(GRAY);
        Hg.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Hg.setBounds(InitX+GapX*11,InitY+GapY*5,WID,LEN);
        Hg.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Hg);

        Tl=new JButton("81 Tl");
        Tl.setFocusable(false);
        Tl.setForeground(WHITE);
        Tl.setBackground(GRAY);
        Tl.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Tl.setBounds(InitX+GapX*12,InitY+GapY*5,WID,LEN);
        Tl.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Tl);

        Pb=new JButton("82 Pb");
        Pb.setFocusable(false);
        Pb.setForeground(WHITE);
        Pb.setBackground(GRAY);
        Pb.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Pb.setBounds(InitX+GapX*13,InitY+GapY*5,WID,LEN);
        Pb.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Pb);

        Bi=new JButton("83 Bi");
        Bi.setFocusable(false);
        Bi.setForeground(WHITE);
        Bi.setBackground(GRAY);
        Bi.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Bi.setBounds(InitX+GapX*14,InitY+GapY*5,WID,LEN);
        Bi.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Bi);

        Po=new JButton("84 Po");
        Po.setFocusable(false);
        Po.setForeground(WHITE);
        Po.setBackground(GRAY);
        Po.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Po.setBounds(InitX+GapX*15,InitY+GapY*5,WID,LEN);
        Po.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Po);

        At=new JButton("85 At");
        At.setFocusable(false);
        At.setForeground(WHITE);
        At.setBackground(GRAY);
        At.setFont(new Font("Arial",H.getFont().getStyle(),17));
        At.setBounds(InitX+GapX*16,InitY+GapY*5,WID,LEN);
        At.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(At);

        Rn=new JButton("86 Rn");
        Rn.setFocusable(false);
        Rn.setForeground(WHITE);
        Rn.setBackground(GRAY);
        Rn.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Rn.setBounds(InitX+GapX*17,InitY+GapY*5,WID,LEN);
        Rn.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Rn);

        Rf=new JButton("104 Rf");
        Rf.setFocusable(false);
        Rf.setForeground(WHITE);
        Rf.setBackground(GRAY);
        Rf.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Rf.setBounds(InitX+GapX*3,InitY+GapY*6,WID,LEN);
        Rf.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Rf);

        Db=new JButton("105 Db");
        Db.setFocusable(false);
        Db.setForeground(WHITE);
        Db.setBackground(GRAY);
        Db.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Db.setBounds(InitX+GapX*4,InitY+GapY*6,WID,LEN);
        Db.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Db);

        Sg=new JButton("106 Sg");
        Sg.setFocusable(false);
        Sg.setForeground(WHITE);
        Sg.setBackground(GRAY);
        Sg.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Sg.setBounds(InitX+GapX*5,InitY+GapY*6,WID,LEN);
        Sg.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Sg);

        Bh=new JButton("107 Bh");
        Bh.setFocusable(false);
        Bh.setForeground(WHITE);
        Bh.setBackground(GRAY);
        Bh.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Bh.setBounds(InitX+GapX*6,InitY+GapY*6,WID,LEN);
        Bh.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Bh);

        Hs= new JButton("108 Hs");
        Hs.setFocusable(false);
        Hs.setForeground(WHITE);
        Hs.setBackground(GRAY);
        Hs.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Hs.setBounds(InitX+GapX*7,InitY+GapY*6,WID,LEN);
        Hs.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Hs);

        Mt=new JButton("109 Mt");
        Mt.setFocusable(false);
        Mt.setForeground(WHITE);
        Mt.setBackground(GRAY);
        Mt.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mt.setBounds(InitX+GapX*8,InitY+GapY*6,WID,LEN);
        Mt.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Mt);

        Ds=new JButton("110 Ds");
        Ds.setFocusable(false);
        Ds.setForeground(WHITE);
        Ds.setBackground(GRAY);
        Ds.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ds.setBounds(InitX+GapX*9,InitY+GapY*6,WID,LEN);
        Ds.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Ds);

        Rg=new JButton("111 Rg");
        Rg.setFocusable(false);
        Rg.setForeground(WHITE);
        Rg.setBackground(GRAY);
        Rg.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Rg.setBounds(InitX+GapX*10,InitY+GapY*6,WID,LEN);
        Rg.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Rg);

        Cn=new JButton("112 Cn");
        Cn.setFocusable(false);
        Cn.setForeground(WHITE);
        Cn.setBackground(GRAY);
        Cn.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Cn.setBounds(InitX+GapX*11,InitY+GapY*6,WID,LEN);
        Cn.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Cn);

        Nh=new JButton("113 Nh");
        Nh.setFocusable(false);
        Nh.setForeground(WHITE);
        Nh.setBackground(GRAY);
        Nh.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Nh.setBounds(InitX+GapX*12,InitY+GapY*6,WID,LEN);
        Nh.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Nh);

        Fl=new JButton("114 Fl");
        Fl.setFocusable(false);
        Fl.setForeground(WHITE);
        Fl.setBackground(GRAY);
        Fl.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Fl.setBounds(InitX+GapX*13,InitY+GapY*6,WID,LEN);
        Fl.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Fl);

        Mc=new JButton("115 Mc");
        Mc.setFocusable(false);
        Mc.setForeground(WHITE);
        Mc.setBackground(GRAY);
        Mc.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Mc.setBounds(InitX+GapX*14,InitY+GapY*6,WID,LEN);
        Mc.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Mc);

        Lv=new JButton("116 Lv");
        Lv.setFocusable(false);
        Lv.setForeground(WHITE);
        Lv.setBackground(GRAY);
        Lv.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Lv.setBounds(InitX+GapX*15,InitY+GapY*6,WID,LEN);
        Lv.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Lv);

        Ts=new JButton("117 Ts");
        Ts.setFocusable(false);
        Ts.setForeground(WHITE);
        Ts.setBackground(GRAY);
        Ts.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Ts.setBounds(InitX+GapX*16,InitY+GapY*6,WID,LEN);
        Ts.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Ts);

        Og= new JButton("118 Og");
        Og.setFocusable(false);
        Og.setForeground(WHITE);
        Og.setBackground(GRAY);
        Og.setFont(new Font("Arial",H.getFont().getStyle(),17));
        Og.setBounds(InitX+GapX*17,InitY+GapY*6,WID,LEN);
        Og.setMargin(new Insets(0,0,0,0));
        CurrentFrame.add(Og);


        CurrentFrame.add(Ag);
        CurrentFrame.add(Cl);
        CurrentFrame.add(S);
        CurrentFrame.add(Ar);
        CurrentFrame.add(Al);
        CurrentFrame.add(P);
        CurrentFrame.add(Si);
        CurrentFrame.add(Ne);
        CurrentFrame.add(F);
        CurrentFrame.add(O);
        CurrentFrame.add(N);
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
        CurrentFrame.add(Fe);
        CurrentFrame.add(Co);
        CurrentFrame.add(Ni);
        CurrentFrame.add(Cu);
        CurrentFrame.add(Zn);
        CurrentFrame.add(Ga);
        CurrentFrame.add(Ge);
        CurrentFrame.add(As);
        CurrentFrame.add(He);
        CurrentFrame.add(Br);
        CurrentFrame.add(Se);
        CurrentFrame.add(Kr);
        CurrentFrame.add(B);
        CurrentFrame.add(C);

    }
}
