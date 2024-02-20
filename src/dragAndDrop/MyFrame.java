package dragAndDrop;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	DragPanel dragPanel;
	
	MyFrame(){
		
		dragPanel = new DragPanel();
		
		this.setTitle("Drag & drop Demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		this.add(dragPanel);
		this.setVisible(true);
		
	}

}
