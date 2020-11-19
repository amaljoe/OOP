package Event;

import java.awt.*;
import java.awt.event.*;


public class Event {
    Frame f;
    Label l;
    TextField tf;
    Button b;

    Event() {
        f = new Frame("Test");
        
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        
        l = new Label("Name");
        tf = new TextField(15);
        b = new Button("click me");
        f.add(l);
        f.add(tf);
        f.add(b);
    }


    public static void main(String[] args) {
        Event e = new Event();
    }
}