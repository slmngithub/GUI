import javax.swing.*;
import java.awt.*;

public class hito {
    public static void main(String [] args){
        JFrame L= new JFrame("hito 1");
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        L.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //PANEL NORTHE
        L.getContentPane().add(p1 , BorderLayout.NORTH);
        p1.setLayout(new FlowLayout());
        JCheckBox C1= new JCheckBox("katniss");
        JCheckBox C2= new JCheckBox("xlr8");
        p1.add(C1);
        p1.add(C2);
        //PANEL ESTE
        p2.setSize(250 , 250);
        /**
         * en el ejercico se dice que este panel no tiene ningun layout , pero sin layout los radios se van mostrar uno alado del otro y no como se pide en
         * ejercico.
         */
        /*-------*/
        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        /*-------*/


        JRadioButton r1=new JRadioButton("opt1" , true);
        JRadioButton r2=new JRadioButton("opt2");
        JRadioButton r3=new JRadioButton("opt3");
        JRadioButton [] ARRADIO = new JRadioButton[]{r1 , r2 , r3};
        ButtonGroup b= new ButtonGroup();

        b.add(r1);
        b.add(r2);
        b.add(r3);


        p2.add(r1  );
        p2.add(r2 );
        p2.add(r3 );
        L.getContentPane().add(p2 , BorderLayout.EAST);


        //panel sur
        p3.setSize(new Dimension(50 , 50));
        p3.setLayout(new BoxLayout(p3 , BoxLayout.X_AXIS));
        L.getContentPane().add(p3 , BorderLayout.SOUTH);
        JButton b1 = new JButton("button 1");
        JButton b2 = new JButton("button 2");
        p3.add(b1 );
        p3.add(b2);
        //PANEL CENTER
        L.getContentPane().add(p4 , BorderLayout.CENTER);
        ImageIcon ii = new ImageIcon("C:\\Users\\ik012982i9\\Desktop\\exam java\\GUI\\src\\descarga.png");

        p4.setLayout(new GridLayout( 2 , 2));
        for (int i=0 ; i<8; i++){
            JLabel l1 = new JLabel(ii);
            l1.setSize(50 , 50);
            p4.add(l1);

        }
        //----------------------
        L.pack();
        L.setVisible(true);

    }
}
