import java.applet.Applet;
import java.awt.*;

public class GraphicsDemo extends Applet {
    public void paint(Graphics g) {
        // Set color
        g.setColor(Color.BLUE);
        g.drawString("Graphics Demo", 50, 30);

        // Draw shapes
        g.drawLine(20, 50, 200, 50);
        g.drawRect(20, 60, 100, 50);
        g.fillRect(130, 60, 100, 50);
        g.drawOval(20, 120, 100, 50);
        g.fillOval(130, 120, 100, 50);
        g.drawArc(20, 180, 100, 100, 0, 180);
        g.fillArc(130, 180, 100, 100, 0, 90);

        // Draw polygon
        int[] xPoints = {20, 70, 120};
        int[] yPoints = {300, 250, 300};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
/*
<html>
<body>
    <applet code="GraphicsDemo.class" width="400" height="300">
    </applet>
</body>
</html>
*/