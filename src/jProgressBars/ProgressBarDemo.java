package jProgressBars;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(); // you can pass the minimum and maximum values in the constructor also
	
	ProgressBarDemo(){
		
		bar.setValue(0); // set the start value of our bar, normally it starts with 0 or 100
		//			  x y  w  h
		bar.setBounds(0,0,420,50);
		// it adds a percentage to the progress bar, while it is filing up, the percentage get's updated
		bar.setStringPainted(true); 
		bar.setFont(new Font("Consolas", Font.BOLD, 15));
		bar.setForeground(Color.red);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		
		while(counter<=100) {
			bar.setValue(counter);
			try {
				// Thread method to make the computer wait, it's is in milliseconds, so 1000ml is 1s
				Thread.sleep(50); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter += 1;
		}
		
		bar.setString("<3 Eu te amo Camile xoxo <3");
	}

}
