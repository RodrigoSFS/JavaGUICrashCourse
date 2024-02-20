package twoDGraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setPaint(Color.BLUE);
		g2D.setStroke(new BasicStroke(5));
//		g2D.drawLine(0, 0, 500, 500);
//		g2D.drawRect(0, 0, 100, 200);
		g2D.fillRect(0, 0, 100, 200);
		
//		É possível desenhar quadrados, retângulos, triângulos, linhas, arcos, tudo
		
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		
		g2D.drawPolygon(xPoints,yPoints, 3);
		
//		g2D.setFont(new Font("Times new Roman", Fong.BOLD,50));
//		g2D.drawString("voce e legal", 50, 50);
		
//		g2D.drawImage(img,00,null);
		
		
	}
	
}
