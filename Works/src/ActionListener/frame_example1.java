package ActionListener;

import java.awt.*;
import java.awt.event.*;

public class frame_example1 extends Frame implements ActionListener{
    TextField tf1;
    TextField tf2;
    TextField result;
    Button b;

    frame_example1() {

        // create components
        tf1 = new TextField(15);
        tf2 = new TextField(15);
        result = new TextField(15);
        // tf.setBounds(60, 50, 170, 20);
        b = new Button("ADD");
        // b.setBounds(100, 120, 80, 30);

        // register listener
        b.addActionListener(this);// passing current instance
        // add components and set size, layout and visibility
    
        add(tf1);
        add(tf2);
        add(b);
        add(result);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(500, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            int sum = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())
            result.setText(String.valueOf(sum));
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }

    public static void main(String args[]) {
        frame_example1 f = new frame_example1();
    }
}