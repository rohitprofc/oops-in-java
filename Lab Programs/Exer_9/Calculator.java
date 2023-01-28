import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    Frame f;

    TextField tf;
    Button b[] = new Button[10];
    Button plus, minus, into, dividedBy, equalsTo, clear;
    int x, y, z;
    String operator;

    public void ButtonDemo() {
        f = new Frame("MyFrame");

        tf = new TextField(10);
        f.add(tf);

        for (int i = 0; i <= 9; i++) {
            b[i] = new Button("" + i);
            f.add(b[i]);
            b[i].addActionListener(this);
        }

        plus = new Button("+");
        f.add(plus);
        plus.addActionListener(this);

        minus = new Button("-");
        f.add(minus);
        minus.addActionListener(this);

        into = new Button("x");
        f.add(into);
        into.addActionListener(this);

        dividedBy = new Button("/");
        f.add(dividedBy);
        dividedBy.addActionListener(this);

        equalsTo = new Button("=");
        f.add(equalsTo);
        equalsTo.addActionListener(this);

        clear = new Button("C");
        f.add(clear);
        clear.addActionListener(this);

        f.setSize(400, 400);
        f.setLayout(new GridLayout(4, 5));
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        String btvalue = ae.getActionCommand();

        if (btvalue == "+" || btvalue == "-" || btvalue == "x" || btvalue == "/") {
            x = Integer.parseInt(tf.getText());
            tf.setText("" + 0);
            operator = btvalue;
        } else if (btvalue == "=") {
            y = Integer.parseInt(tf.getText());
            if (operator == "+") {
                z = x + y;
            } else if (operator == "-") {
                z = x - y;
            } else if (operator == "x") {
                z = x * y;
            } else if (operator == "/") {
                z = x / y;
            }
            tf.setText("" + z);
            operator = "";
            x = 0;
            y = 0;
        } else if (btvalue == "C") {
            tf.setText("");
            operator = "";
            x = 0;
            y = 0;
        } else {
            String n = tf.getText() + btvalue;
            tf.setText(n);
        }
    }

    public static void main(String[] args) {
        ButtonDemo bd = new ButtonDemo();
    }
}
