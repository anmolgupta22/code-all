import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.util.logging.Handler;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class swing1 extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1;

   public  swing1()
    {
    }
  public   swing1(String s)
    {

        super(s);
}
    public void setComponents()
    {
l1 =new JLabel("Addition of two numbers");
l2=new JLabel("First number");
l3=new JLabel("Second number");
l4=new JLabel();
t1 =new JTextField("0");
t2 =new JTextField("0");
//final JTextField t2=new HintTextField("hllo");

//t3=new JTextField();
   //     t3.setEditable(false);
        b1 =new JButton("Add");
setLayout(null);
l1.setBounds(50,50,500,20);
l2.setBounds(50,80,200,20);
t1.setBounds(150,80,100,20);
l3.setBounds(50,110,300,20);
t2.setBounds(150,110,100,20);
l4.setBounds(90,140,100,20);
b1.setBounds(150,160,100,20);
b1.addActionListener(new Handler());
add(l1);
add(l2);
//add(t3);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
    }
     class Handler implements ActionListener {
         public void actionPerformed(ActionEvent e) {
             int a = Integer.parseInt(t1.getText());
             int b = Integer.parseInt(t2.getText());
             int s = a + b;
             l4.setText("Result is:      "+s);
         }


     }



    public static void main(String arg[])
    {
        swing1 jf =new swing1("swing");
        jf.setComponents();
        jf.setSize(300,300);
        jf.setVisible(true);


    }
}
