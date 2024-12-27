import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerAppletDemo extends Applet {
    Frame frame;

    public void init() {
        // Create a Frame to host the Applet
        frame = new Frame("Window Listener Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Close the window to see the event.");
        frame.add(label);

        // Add a WindowListener to the Frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                frame.dispose(); // Close the frame
                System.exit(0); // Exit the application
            }

            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }
        });

        // Make the Frame visible
        frame.setVisible(true);
    }

    public void destroy() {
        // Dispose the frame when the applet is destroyed
        frame.dispose();
    }
}

/*
<html>
<body>
<applet code="WindowListenerAppletDemo.class" width="400" height="300">
</applet>
</body>
</html>
*/