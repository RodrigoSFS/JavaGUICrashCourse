package menuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	// ImageIcons can be used just like the other examples!
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		
		menuBar = new JMenuBar();
		fileMenu = new  JMenu("File");
		editMenu = new  JMenu("Edit");
		helpMenu = new  JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for Load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for Exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		// now we add to the menu bar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		
		this.setJMenuBar(menuBar); // instead of adding, we set the menu bar
		// we have to add menus to the menuBar in order to be visible
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== loadItem) {
			System.out.println("Loading...");
		}
		if(e.getSource()== saveItem) {
			System.out.println("Saving...");
		}
		if(e.getSource()== exitItem) {
			System.exit(0); // actual way to exit the program
		}
		
	}
}
