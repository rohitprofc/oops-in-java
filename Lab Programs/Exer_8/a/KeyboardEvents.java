
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvents extends Applet implements KeyListener {
	String msg = "";

	public void init() {
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke) {
		int v = ke.getKeyCode();
		showStatus("Key Pressed is " + v);

	}

	public void keyReleased(KeyEvent ke) {
		showStatus("Key Released");
	}

	public void keyTyped(KeyEvent ke) {
		showStatus("Key Typed");
		msg = msg + ke.getKeyChar();
		repaint();
	}

	public void paint(Graphics g) {
		Font f = new Font("Harrington", Font.BOLD, 27);
		g.setFont(f);
		g.drawString(msg, 100, 100);
	}

}
/*
 * Output:-
 * C:\Users\Desktop\Rohit>javac KeyboardEvents.java
 * 
 * C:\Users\Desktop\Rohit>appletviewer MyPageKeyboard.html
 */
