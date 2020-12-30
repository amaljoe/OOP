/**
 * Write a Java program that works as a simple calculator using Frame. 
 * Arrange Buttons for digits and the + - * % operations properly and 
 * perform the calculations.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    JTextField display;
    JButton number1;
    JButton number2;
    JButton number3;
    JButton number4;
    JButton number5;
    JButton number6;
    JButton number7;
    JButton number8;
    JButton number9;
    JButton number0;
    JButton decimalPoint;
    JButton equals;
    JButton clear;
    JButton add;
    JButton subtract;
    JButton divide;
    JButton multiply;
    JButton mod;

    String expression;


    Calculator() {
        setSize(480, 640);
        setVisible(true);
        setTitle("Calculator");
        setLayout(null);

        expression = "";

        display = new JTextField("");
        number1 = new JButton("1");
        number2 = new JButton("2");
        number3 = new JButton("3");
        number4 = new JButton("4");
        number5 = new JButton("5");
        number6 = new JButton("6");
        number7 = new JButton("7");
        number8 = new JButton("8");
        number9 = new JButton("9");
        number0 = new JButton("0");
        equals = new JButton("=");
        clear = new JButton("CLEAR");
        add = new JButton("+");
        subtract = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("*");
        mod = new JButton("%");

        display.setEditable(false);

        JButton buttons[] = new JButton[17];
        buttons[0] = number7;
        buttons[1] = number8;
        buttons[2] = number9;
        buttons[3] = add;
        buttons[4] = number4;
        buttons[5] = number5;
        buttons[6] = number6;
        buttons[7] = subtract;
        buttons[8] = number1;
        buttons[9] = number2;
        buttons[10] = number3;
        buttons[11] = multiply;
        buttons[12] = divide;
        buttons[13] = number0;
        buttons[14] = mod;
        buttons[15] = equals;
        buttons[16] = clear;

        display.setFont(new Font("montserrat", Font.PLAIN, 34));
        display.setBounds(40, 50, 400, 50);
        add(display);

        int topMargin = 180;
        int leftMargin = 20;
        int padding = 40;
        int size = 60;
        Font font = new Font("montserrat", Font.PLAIN, 26);

        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            button.setFont(font);
            add(button);
            button.addActionListener(this);

            if(i == 16) {
                button.setBounds(250, topMargin - size, size * 3, size);
                continue;
            }
            int x = i % 4;
            int y = i / 4;
            button.setBounds(leftMargin + padding + x * (padding + size), topMargin + padding + y * (padding + size), size, size);
        }
       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button == clear) {
            changeDisplayText("");
        } else if(button == equals) {
            calculate();
        } else {
            String text = button.getText();
            addToDisplay(text);
        }
    }

    private void addToDisplay(String text) {
        expression += text;
        display.setText(expression);
    }

    private void changeDisplayText(String text) {
        expression = text;
        display.setText(expression);
    }

    private void calculate() {
        expression += " ";
        int result = 0;
        int term = 0;
        char lastOperand = ' ';
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(Character.isDigit(ch)) {
                term = term * 10 + Integer.parseInt(Character.toString(ch));
            } else {
                result = operate(result, term, lastOperand);
                lastOperand = ch;
                term = 0;
            }
        }
        changeDisplayText(Integer.toString(result));
    }

    private int operate(int lastTerm, int term, char operand) {
        switch(operand) {
            case '+':
                return lastTerm + term;
            case '-':
                return lastTerm - term;
            case '*':
                return lastTerm * term;
            case '/':
                return lastTerm / term;
            case '%':
                return lastTerm % term;
            default:
                return term;
        }
    }
     
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
