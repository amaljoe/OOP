package Mouse;

import java.awt.*;
import java.awt.event.*;


public class Mouse extends Frame implements MouseMotionListener{
    int status;

    Mouse(){
        setVisible(true);
        setSize(500, 500);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        if(status == 0){
            g.setColor(Color.red);
            g.fillRect(50, 100, 150, 100);
        }
        else if(status == 1){
            g.setColor(Color.blue);
            g.fillOval(50, 100, 150, 100);
        }
    }

    public void mouseMoved(MouseEvent me){
        if(status == 1){
            status = 0;
            repaint();
        }
    }

    public void mouseDragged(MouseEvent me){
        if(status == 0){
            status = 1;
            repaint();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
    }
}
