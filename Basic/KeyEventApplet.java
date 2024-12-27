import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KeyEventApplet extends Applet implements KeyListener {
    String msg = "";   // To display the message based on key events

    public void init() {
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);

        // Register the applet as a KeyListener
        addKeyListener(this);
    }

    // Invoked when a key is pressed
    public void keyPressed(KeyEvent e) {
        msg +="   "+"   keypressed"   +e.getKeyChar();
        repaint();
    }

    // Invoked when a key is released
    public void keyReleased(KeyEvent e) {
        msg +=  e.getKeyChar();
        repaint();
    }

    // Invoked when a key is typed
    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    // Paint the message on the applet
    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}
/*
<html>
<body>
    <applet code="KeyEventApplet.class" width="400" height="200"></applet>
</body>
</html>
*/