package mouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0,0,100,100 ); // since the frame doesn't have a layout
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this); // now this label can respond to different mouse events
		
		// what if we add the MouseListener to the frame also?
		//this.addMouseListener(this);
		// the answer is, when the mouse enters the space of the frame,
		// or click within it the label changes the color
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when the mouse button has been pressed on a component
		// if i hold down a mouse button, that method will be executed
		
		//System.out.println("You pressed the mouse");
		
		//label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when the mouse button has been released on a component
		
		//System.out.println("You released the mouse");
		//label.setBackground(Color.green);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		
		System.out.println("You entered the component");
		
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits
		
		System.out.println("You exited the component");
		
		label.setBackground(Color.red);
		
	}
	
}
