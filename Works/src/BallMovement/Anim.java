package BallMovement;

import java.awt.*;
import java.awt.event.*;

public class Anim extends Frame {
    int x = 0;
    int y = 0;

    boolean forward = true;

    Anim(){
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, 30, 30);
        if(forward){
            x++;
            y++;
        }
        else{
            x--;
            y--;
        }
        if(x > 500){
            forward = false;
        }
        else if(x < 0){
            forward = true;
        }
        try{
            Thread.sleep(50);
            repaint();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Anim anim = new Anim
    }
}
