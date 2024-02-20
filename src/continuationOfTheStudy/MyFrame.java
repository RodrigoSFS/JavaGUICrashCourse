package continuationOfTheStudy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	// The action listener method needs to know these variables, that's why we need to declare them outside
	// of the constructor
	// they need to be global, not local
	JTextField textField;
	JButton button;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 35)); // font, style, size
		textField.setForeground(Color.green); // text color
		textField.setBackground(Color.black); // background color
		textField.setCaretColor(Color.green); // Caret color
		textField.setText("username"); // default text
		
		
		button = new JButton("Submit");
		button.addActionListener(this); // since this class is implementing the action listener, we can say "this"
		
		this.add(button);
		this.add(textField);
		this.pack(); // the size will adjust depending on the components
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== button) {
			System.out.println(textField.getText());
			button.setEnabled(false); // disable the button
			textField.setEditable(false); // make the text field not editable
			
		}
		
	}

}
