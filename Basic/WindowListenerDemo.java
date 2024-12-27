import java.awt.*;
import java.awt.event.*;

public class WindowListenerDemo extends Frame implements WindowListener {
    public WindowListenerDemo() {
        setTitle("Window Listener Example");
        setSize(400, 300);
        addWindowListener(this); // Registering the listener
        setVisible(true);
    }

    // Implementing all methods of WindowListener
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new WindowListenerDemo();
    }
}
/*
<html>
<body>
<applet code="WindowListenerDemo.class" width="400" height="300">
</applet>
</body>
</html>
*/