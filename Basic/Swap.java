import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Swap extends Applet implements ActionListener{
public void init(){
Button b1=new Button("Red");
Button b2=new Button("Yellow");
Button b3=new Button("Green");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
/*
public void paint(Graphics g){
g.drawString("Button Demo",100,100);
}
*/
public void actionPerformed(ActionEvent ae){
String str =ae.getActionCommand();
if(str.equals("Red"))
{setBackground(Color.red);}
else if (str.equals("Green"))
{setBackground(Color.green);}
else {
setBackground(Color.yellow);}
}
}

/*
<html>
<body>
<applet code = "Swap.class" width = "600" height ="500">
</applet>
</body>
</html>
*/