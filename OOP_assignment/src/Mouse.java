/**
 * 6. Write a Java program for handling mouse events.
 */

import java.awt.*;
import java.awt.event.*;


public class Mouse extends Frame implements MouseMotionListener{
    int x;
    int y;

    Mouse(){
        setVisible(true);
        setSize(500, 500);
        setTitle("Mouse Tracker");
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(x - 25, y - 25, 50, 50);
    }

    public void mouseMoved(MouseEvent me){
        x = me.getX();
        y= me.getY();
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        x = me.getX();
        y= me.getY();
        repaint();
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
    }
}
