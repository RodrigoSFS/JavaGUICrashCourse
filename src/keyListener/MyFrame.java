package keyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//									that's one way to implement the KeyListener interface
public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon iconBomb;
	ImageIcon openhaima;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null); // we're going to be manually moving components, so the layout must be null
		// adds the key listener to the frame which has it implemented in
		this.addKeyListener(this); // this frame will now respond to key events
		
		iconBomb  = new ImageIcon("labomb.png");
		openhaima  = new ImageIcon("openhaima.jpg");
		
		label = new JLabel();
		//			    x y  w   h
		label.setBounds(0,0,100,100); // since the frame doesn't have a layout
		label.setBackground(Color.black);
		label.setOpaque(true); // the background doesn't like to display without it
		
		this.getContentPane().setBackground(Color.black); // change the frame background color
		label.setIcon(iconBomb);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// KeyTyped 	= Invoked when a key is typed. Uses KeyChar, char output
		// the more efficient way to do it is with a switch case
		
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-5, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-5);
				break;
			case 's': label.setLocation(label.getX(), label.getY()+5);
				break;
			case 'd': label.setLocation(label.getX()+5, label.getY());
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed 	= Invoked when a physical key is pressed down. Uses KeyCode, int output
		// each button on the keyboard has a associative number, and KeyCode gives us that
		
		// the arrow keys, doesn't produce a KeyChar, but the produce a KeyCode
		
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-5, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-5);
			break;
		case 40: label.setLocation(label.getX(), label.getY()+5);
			break;
		case 39: label.setLocation(label.getX()+5, label.getY());
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyReleased 	= Called whenever a button is released
		//System.out.println("you released key code: " + e.getKeyChar());
		
		// the code to upper case letters and  lower case letters are the same
		System.out.println("you released key char: " + e.getKeyCode()); 
		
	}
	
}
