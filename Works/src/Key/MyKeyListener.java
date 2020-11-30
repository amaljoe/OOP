package Key;

import java.awt.*;
import java.awt.event.*;

public class MyKeyListener extends Frame implements KeyListener {

    String str;
    char ch;

    MyKeyListener() // link the KeyListener with Applet
    {
        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

 public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar();
        if (ch == 'a')
            str = "a for apple";
        else if (ch == 'e')
            str = "e for elephant";
        else if (ch == 'i')
            str = "i for igloo";
        else if (ch == 'o')
            str = "o for ox";
        else if (ch == 'u')
            str = "u for umbrella";
        else
            str = "Type only vowels a, e, i, o, u only";

        repaint();
    }

    
public void paint(Graphics g) {
        g.drawString(str, 100, 150);

    }

    public static void main(String args[]) {
        MyKeyListener ob = new MyKeyListener();
    }
}