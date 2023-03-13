import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class JFRAME1 {
    public static void main(String [] args){
        JFrame f = new JFrame("first window");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //f.setSize(1200 , 1000);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4 , 3));
        JButton b1= new JButton("wtani1");
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList <String> L=new JList<>(items);
        //JScrollPane S = new JScrollPane(L);

        JToggleButton T=new JToggleButton("WTANI NCHOF");
        JCheckBox c =new JCheckBox("checkini");
        //---------------------
        JRadioButton r = new JRadioButton("RADIO1");
        JRadioButton r2 = new JRadioButton("RADIO2");
        JRadioButton r3 = new JRadioButton("RADIO3");
        /*ButtonGroup b = new ButtonGroup();
        b.add(r);
        b.add(r2);
        b.add(r3);*/
        //-----------------------------------------
        Integer[] INTS = {12, 13, 23, 45, 65};
        JComboBox <Integer> cb = new JComboBox<>(INTS);
        JTextComponent t = new JTextArea("SALAM 3ALIKM");
        JPasswordField ps = new JPasswordField("passord");






        p.add(b1);
        p.add(L);
        //f.add(S);
        p.add(T);
        p.add(c);
        //------
        p.add(r);
        //p.add(r2);
        //p.add(r3);
        //--------
        p.add(cb);
        p.add(t);
        p.add(ps);


        f.getContentPane().add(p, BorderLayout.CENTER);
        /*ImageIcon i = new ImageIcon("C:\\Users\\ik012982i9\\Desktop\\exam java\\GUI\\src\\XLR8.PNG.png");
        JLabel l= new JLabel(i);
        //l.setPreferredSize(new Dimension(10 , 10));
        f.getContentPane().add(l, BorderLayout.CENTER);
        JButton b= new JButton("wtani");
        b.setSize(10 , 10);
        f.add(b , BorderLayout.NORTH);
        JCheckBox c =new JCheckBox("checkini");
        f.getContentPane().add(c , BorderLayout.AFTER_LAST_LINE);*/
        f.pack();
        f.setVisible(true);
    }
}
