import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;

public class hito2 extends JFrame implements ActionListener /*, ItemListener */{
    JFrame f;
    JComboBox cb;
    JTextArea T;
    public hito2(){
         f = new JFrame("Test Events : Files");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel Rp = new JPanel();
        //Rp.setLayout(new BoxLayout(Rp , BoxLayout.X_AXIS ));
        Rp.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 20));
        String[] txts = {"elegir el nombre de archivo", "python.txt", "c.txt" , "java.txt" , "fechero no existe"};
         cb = new JComboBox<>(txts);
        //cb.setSize(new Dimension(100 , 50));
        cb.addActionListener(this);
        JButton clear = new JButton("clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                T.setText("");
            }
        });



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
        T.setBorder(BorderFactory.createTitledBorder("text"));
        JScrollPane S = new JScrollPane (T);
        f.add(S);
        f.add(Lp , BorderLayout.EAST);
        //----------------PANEL CLOSE------------------
        JPanel closeP=new JPanel();
        JButton close= new JButton("close");
        closeP.add(close);
        close.addActionListener(this);
        f.add(closeP,BorderLayout.SOUTH);





        f.pack();
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        if(a.getActionCommand().equals("comboBoxChanged")){
            String sele ="src" + File.separator + cb.getSelectedItem().toString();
            String src=cb.getSelectedItem().toString();

            if (!src.equals("elegir el nombre de archivo")){
                try{
                    T.setText("");
                    File file = new File( sele );
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String s ;
                    while ((s=reader.readLine())!=null){
                        T.append(s + "\n");
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("hola");
                    T.setText("");
                    JOptionPane.showMessageDialog(null , "File Not Found");

                } catch (IOException e) {
                    System.out.println("adios");
                    T.setText("");
                    JOptionPane.showMessageDialog(null , "Failed in read the file");
                }
            }
        }
        else {
            f.dispose();
        }

    }

    /*@Override
    public void itemStateChanged(ItemEvent I) {
        String sele ="src" + File.separator + cb.getSelectedItem().toString();
        String src=cb.getSelectedItem().toString();
        if (I.getStateChange() == 2){
            return;
        }
        if (!src.equals("elegir el nombre de archivo")){
            try{
                T.setText("");
                File file = new File( sele );
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String s ;
                while ((s=reader.readLine())!=null){
                    T.append(s + "\n");
                }
            } catch (FileNotFoundException e) {
                System.out.println("hola");
                T.setText("");
                JOptionPane.showMessageDialog(null , "File Not Found");

            } catch (IOException e) {
                System.out.println("adios");
                T.setText("");
                JOptionPane.showMessageDialog(null , "Failed in read the file");
            }
        }

    }*/


}


