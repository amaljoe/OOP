package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class swing1 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton add1;
    int sum;
 
    swing1() {
        JPanel p = new JPanel();
 
        l1 = new JLabel("First No:");
        p.add(l1);
        t1 = new JTextField(10);
        p.add(t1);
        l2 = new JLabel("Second No:");
        p.add(l2);
        t2 = new JTextField(10);
        p.add(t2);
        l3 = new JLabel("Result:");
        p.add(l3);
        t3 = new JTextField(10);
        p.add(t3);
        add1 = new JButton("+");
        p.add(add1);
        add1.addActionListener(this);
        p.setBackground(Color.pink);
        setContentPane(p);
        setSize(200, 200);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add1) {
            sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(sum));
        }
    }
 
    public static void main(String args[]) {
        swing1 s = new swing1();
    }
}

