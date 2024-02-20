import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	LaunchPage(){
		
		// 					x   y   w  h
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this); // it passes this class object, "LaunchPage", that implements the 
		//									 ActionListener interface, so "LaunchPage" has all it's functions
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	// this is going to be the action performed method when we click on the button
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==myButton) {
			frame.dispose(); // it's going to get rid of the frame when the button is pressed
			NewWindow myWindow = new NewWindow(); // that alone already opens a new window, but infinitely
		}
		
	}
}
