package twoDAnimations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 3;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.gray);
		enemy = new ImageIcon("labomb.png").getImage();
		backgroundImage = new ImageIcon("elon.png").getImage();
		timer = new Timer(10, this); // delay, actionListener
		timer.start();
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		Graphics2D g2d= (Graphics2D) g;
		
		g2d.drawImage(backgroundImage,0,0,null);
		g2d.drawImage(enemy,x,y,null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(x>= PANEL_WIDTH - enemy.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		
		if(y>= PANEL_HEIGHT - enemy.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		
		repaint();
		
	}

}
