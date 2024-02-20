package mouseListenerDemoProject;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon happy;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,1000);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		happy = new ImageIcon("happy.png");
		nervous = new ImageIcon("nervous.jpg");
		pain = new ImageIcon("labomb.png");
		dizzy = new ImageIcon("openhaima.jpg");
		
		label.setIcon(happy);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null); // the frame will appear on the middle of the computer screen
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(dizzy);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(pain);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		label.setIcon(nervous);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
		label.setIcon(happy);
		this.pack();
		
	}

}
