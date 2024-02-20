package dragAndDrop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{
	
	ImageIcon image = new ImageIcon("elon.png");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point previousPoint;
	
	DragPanel(){
		//						x y
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//		   the panel, g,  	the new x,				the new y
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			previousPoint = e.getPoint();
			
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			
			imageCorner.translate(
					
					(int)(currentPoint.getX() - previousPoint.getX()),
					(int)(currentPoint.getY() - previousPoint.getY())
					
			);
			previousPoint = currentPoint;
			repaint();
		}
		
	}

}
