import javax.swing.*;
import java.awt.*;
import java.applet.*;
public class Human extends JApplet {
	public void paint(Graphics g){
		g.setColor(new Color(255,215,0));
		g.drawOval(500, 150, 100, 100);
		g.fillOval(500,150,100,100);
		
		g.drawRect(450, 250, 200, 200);
		g.fillRect(450, 250, 200, 200);
		g.setColor(new Color(0,0,255));
		g.drawLine(650, 300, 700, 375);
		g.drawLine(650, 325, 700, 400);
		g.drawLine(700,375,700,400);
		g.drawLine(450, 300, 400, 375);
		g.drawLine(450,325,400,400);
		g.drawLine(400, 375, 400, 400);
		g.drawLine(500, 450, 500, 550);
		g.drawLine(600,450,600,550);
		g.drawLine(600, 450, 625, 525);
		g.drawLine(625, 525, 600, 550);
		g.drawLine(500,450,525,525);
		g.drawLine(525,525,500,550);
		g.setColor(new Color(0,0,0));
		g.drawOval(520, 175, 10, 10);
		g.fillOval(520, 175, 10, 10);
		g.drawOval(570, 175, 10, 10);
		g.fillOval(570, 175, 10, 10);
		g.drawArc(535, 215, 30, 20, 0,-180);
		
		
	}

}
