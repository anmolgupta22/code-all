
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test
{
    public static void main(String args[])
    {
        JFrame j = new JFrame();
        JLabel l1;
        JTextField t1;
        JLabel l2;
        JTextField t2;
        JButton b;
        JLabel l3;


        l1 = new JLabel("First Number:");
        t1 = new JTextField(20);

        l2 = new JLabel("Second Number:");
        t2 = new JTextField(20);

        b = new JButton("Add");

        l3 = new JLabel("Result");

        j.add(l1);
        j.add(t1);
        j.add(l2);
        j.add(t2);
        j.add(b);
        j.add(l3);

       // b.addActionListener(this);

        j.setVisible(true);
        j.setSize(250, 400);

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(ae -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int value = num1 + num2;
            l3.setText("" + value);
        });

    }
}

