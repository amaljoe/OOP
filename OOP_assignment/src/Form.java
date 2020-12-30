
/**
 * 4. Write a Java program to create a form containing
 * text fields, Labels, Checkbox, radio button etc using Frame.
 */

import java.awt.*;
import java.awt.event.*;

public class Form extends Frame {

    Form() {
        setSize(270, 300);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new Label("Name          :"));
        add(new TextField(10));

        add(new Label("Address       :"));
        add(new TextField(10));

        add(new Label("Birthday      :"));
        add(new TextField(10));

        add(new Label("Job           :"));
        CheckboxGroup job = new CheckboxGroup();
        add(new Checkbox("Student", job, false));
        add(new Checkbox("Teacher", job, false));

        add(new Label("Hobbies       :"));
        add(new Checkbox("Reading", false));
        add(new Checkbox("Cycling", false));

        add(new Button("Register"));
        add(new Button("Exit"));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Form form = new Form();
    }
}
