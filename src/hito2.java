import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class hito2 extends JFrame implements ActionListener {
    JFrame f;
    JComboBox cb;
    JTextArea T;
    public hito2(){
         f = new JFrame("Test Events : Files");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel Rp = new JPanel();
        //Rp.setLayout(new BoxLayout(Rp , BoxLayout.X_AXIS ));
        Rp.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 20));
        String[] txts = {"elegir el nombre de archivo", "python.txt", "c.txt" , "java.txt"};
         cb = new JComboBox<>(txts);
        cb.setSize(new Dimension(100 , 50));
        cb.addActionListener(this);
        JButton clear = new JButton("clear");
        Rp.add(cb);
        Rp.add(clear);
        f.add(Rp , BorderLayout.WEST);

        //---------------------------------
        JPanel Lp = new JPanel();
        Lp.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 20));

         T = new JTextArea();
        T.setEditable(false);
        T.setPreferredSize(new Dimension(500 , 500));
        Lp.add(T);
        f.add(Lp , BorderLayout.EAST);
        T.setBorder(BorderFactory.createTitledBorder("text"));



        f.pack();
        f.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent a) {
        String sele = cb.getSelectedItem().toString();


        try{
            T.setText("");
            File file = new File("C:\\Users\\ik012982i9\\Desktop\\oussama\\exam java\\GUI\\src\\" + sele );
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s ;
            while ((s=reader.readLine())!=null){
                T.append(s + "\n");
            }
        } catch (FileNotFoundException e) {
            T.setText(e.getMessage());
        } catch (IOException e) {
            T.setText(e.getMessage());
        }
    }
}
