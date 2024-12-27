import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/* 
<applet code="MouseEventDemo" width=400 height=300>
</applet>
*/
public class MouseEventDemo extends Applet {
    String message = "MouseEventDemo";

    @Override
    public void init() {
        // Add MouseAdapter for handling mouse pressed and released events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                message = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                message = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }
        });

        // Add MouseMotionAdapter for handling mouse moved events
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                message = "Mouse Moved to (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 20, 50);
    }
}
/*
<html>
<body>
    <applet code="MouseEventDemo.class" width="400" height="300">
    </applet>
</body>
</html>
*/