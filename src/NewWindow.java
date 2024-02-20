import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!"); // set the text in the constructor, the same works with buttons
	
	NewWindow(){
		//				x y  w  h
		label.setBounds(0,0,100,50);
		//				   font name   state	size
		label.setFont(new Font(null, Font.PLAIN,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
