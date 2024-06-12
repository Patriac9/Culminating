import javax.swing.*;

public class Main {

    static final String TITLE="Periodic table";
    public static void main(String[] args) {
        JFrame MainFrame=new JFrame(TITLE);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setSize(1080,720);
        MainFrame.setVisible(true);

        ImageIcon iconimage=new ImageIcon("Icon.png");
        MainFrame.setIconImage(iconimage.getImage());
    }
}