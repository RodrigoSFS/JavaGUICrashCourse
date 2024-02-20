package jSliders;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("Slider Demo"); // the text can be set or can't be passed by the constructor
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); //minimum value, maximum value, starting point
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		slider.setPreferredSize(new Dimension(400,200)); // size
		slider.setPaintTicks(true); // marks
		slider.setMinorTickSpacing(10); // rhythm of the marks, one mark for each value
		
		slider.setPaintTrack(true); // larger marks
		slider.setMajorTickSpacing(25); // rhythm of the larger marks, one large mark for each value
		
		slider.setPaintLabels(true); // shows the numbers for each of the Major Ticks
		slider.setFont(new Font("Consolas", Font.PLAIN, 15));
		label.setFont(new Font("Consolas", Font.PLAIN, 25));
		
		//                      default is Horizontal, can be set to that, or to Vertical
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		// set the text for the label, and get the Current Value of the Slider
		label.setText("ºC = " + slider.getValue());
		
		// the state changes on the slider, so we have to add the ChangeListener object to the slider
		// in order to the stateChanged method to be executed when one of the properties of the slider, change
		slider.addChangeListener(this);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// whenever the state changes from the slider, this code will be executed and the text will be updated
		label.setText("ºC = " + slider.getValue());
		
	}

}
