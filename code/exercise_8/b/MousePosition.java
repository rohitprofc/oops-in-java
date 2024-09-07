
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MousePosition extends Applet implements MouseListener, MouseMotionListener {

    String msg1 = "", msg2 = "";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        msg1 = "X= " + x;
        msg2 = "Y= " + y;
        showStatus("Mouse Moved");
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        msg1 = "X= " + x;
        msg2 = "Y= " + y;
        showStatus("Mouse Dragged");
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        showStatus("Mouse Entered");
    }

    public void mouseExited(MouseEvent me) {
        showStatus("Mouse Exited");
    }

    public void mouseClicked(MouseEvent me) {
        showStatus("Mouse Clicked");
    }

    public void mousePressed(MouseEvent me) {
        showStatus("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent me) {
        showStatus("Mouse Released");
    }

    public void paint(Graphics g) {
        Font f = new Font("Harrington", Font.BOLD, 27);
        g.setFont(f);
        g.drawString(msg1 + " " + msg2, 100, 100);
    }
}
/*
 * Output:-
 * C:\Users\Desktop\Desk\Rohit>javac MousePosition.java
 *
 * C:\Users\Desktop\Desk\Rohit>javac MyApplet.java
 * 
 * C:\Users\Desktop\Desk\Rohit>appleteviewer MyPageMouse.html
 */