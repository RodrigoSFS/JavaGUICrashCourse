package jFileChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // it's nice the effect of the FlowLayout and the pack method
		
		button = new JButton("Select file");
		button.addActionListener(this);
		
		this.add(button);
		this.pack(); 
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			//can be expressed the relative or absolute address path
			//					trick to open the project folder:
			
			fileChooser.setCurrentDirectory(new File(".")); // it sets the current directory when the fileChooser opens
			
			//System.out.println(fileChooser.showOpenDialog(null)); // if the file is selected and the button open is
			// clicked, the response will be 0, if it is canceled, the response will be 1, and if it clicks
			// on the x, the response will be 1 also
			//int response = fileChooser.showOpenDialog(null); // select file to open
			//													it changes the fileChooser purpose Style
			int response = fileChooser.showSaveDialog(null); // select file to save, it changes the button
			
			// if (response == 0) // is one way to write it
			// but the better way is:
			if (response == JFileChooser.APPROVE_OPTION) {
				// create a new file containing the absolute path of the file selected by the fileChooser object
				// when the button "open is pressed"
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); 
				System.out.println(file); // print the path of the file
			}
		}
		
	}

}
