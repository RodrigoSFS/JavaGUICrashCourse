package continuationOfTheStudy;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrameForCheckBox extends JFrame implements ActionListener{
	
	JCheckBox checkBox;
	JButton button;
	
	ImageIcon checkmark;
	ImageIcon x;
	
	MyFrameForCheckBox(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		checkmark  = new ImageIcon("checkmark.png");
		x  = new ImageIcon("x.png");
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot"); // the text could also be set on the check box constructor
		checkBox.setFocusable(false); // get rid of the annoying box on the text
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(x);
		checkBox.setSelectedIcon(checkmark);
		
		button = new JButton();
		button.setText("Submit"); // the text could also be set on the button constructor
		button.addActionListener(this); // action listener is implemented on the frame class
		//								   when it clicked, is going to trigger that actionPerformed method
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
			//checkBox.isSelected(); // returns true or false if the check box is selected
		}
		
	}

}
