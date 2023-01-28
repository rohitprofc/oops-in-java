import java.awt.*;
import java.awt.event.*;

public class ControlEvent extends Frame implements ItemListener {
    Frame f;
    TextField tf;
    Choice c;

    void controlEvent() {
        f = new Frame("Control Event");
        c = new Choice();
        c.add("AI&DS");
        c.add("CSE");
        c.add("IT");
        tf = new TextField();
        f.add(c);
        f.add(tf);
        f.setLayout(new FlowLayout());
        f.setSize(400, 500);
        f.setVisible(true);
        c.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {

        tf.setText(tf.getName());

    }

    public static void main(String[] args) {
        ControlEvent ce = new ControlEvent();
    }

}
