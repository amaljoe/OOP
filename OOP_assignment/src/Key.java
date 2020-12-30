import java.awt.*;
import java.awt.event.*;

public class Key extends Frame {

    String str;
    char ch;

    Key() {
        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Vowels");
        addKeyListener(new KeyAdapter() {
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
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString(str, 100, 150);
    }

    public static void main(String args[]) {
        Key ob = new Key();
    }
}