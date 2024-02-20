package jColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("this is some text");
		label.setFont(new Font("Consolas", Font.PLAIN, 30));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == button) {
			// create a instance of the JColorChooser
			JColorChooser colorChooser = new JColorChooser();
			
			// save a color selected on the dialog box of the class JColorchoser
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			System.out.println(color);
			
			// label.setForeground(color); change the font
			label.setBackground(color); // change the background
		
			// it's not necessary to do it with labels, but it is convenient because of the text and stuff
			// but it can be made with all sorts of components
		}
		
	}

}
