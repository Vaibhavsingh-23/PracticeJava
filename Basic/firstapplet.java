import java.awt.*;
import java.applet.*;

public class Firstapplet extends Applet{
	public void paint(Graphics g){
		/*g.drawLine(1,5,50,5);
		g.drawRect(1,7,50,10);
		g.setColor(Color.RED);
		g.fillRect(1,120,200,200);
		g.fillOval(1,40,50,10);
		g.fillArc(1,60,50,50,0,180);
		g.setColor(Color.GREEN);
		g.drawArc(1,120,200,200,0,-180);
		g.drawRect(1,320,200,200);
		g.drawArc(1,320,200,200,0,180);
		g.drawArc(201,120,200,200,0,-180);
		g.drawArc(201,320,200,200,0,180);
		*/
		int[] a={1,200,100};
		int[] b={1,1,110};
		g.drawPolygon(a,b,3);
		
		
		
	}
} 


/*
<html>
<body>
    <applet code="Firstapplet.class" width="400" height="300">
    </applet>
</body>
</html>
*/