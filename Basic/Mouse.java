import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Mouse extends Applet {
    MouseAdapterex mouseAdapter;

    public void init() {
        mouseAdapter = new MouseAdapterex(this);
        addMouseListener(mouseAdapter);
    }

    public void paint(Graphics g) {
        if (mouseAdapter != null) {
            g.drawString("Mouse clicked at " + mouseAdapter.getX() + ", " + mouseAdapter.getY(), 20, 20);
        }
    }
}

class MouseAdapterex extends MouseAdapter {
    private int x, y;
    private Mouse applet;

    MouseAdapterex(Mouse applet) {
        this.applet = applet;
    }

    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        applet.repaint(); // Request a repaint to update the display
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

/*
<html>
<body>
    <applet code="Mouse.class" width="400" height="200"></applet>
</body>
</html>
*/
