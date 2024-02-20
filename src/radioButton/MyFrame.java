package radioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton hamburguerButton;
	JRadioButton hotdogButton;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// you can also set the icon to each of the RadioButtons, but i already did it a lot and i'm lazy
		
		pizzaButton = new JRadioButton("Pizza"); // setText() or passe it in the constructor
		hamburguerButton = new JRadioButton("Hamburguer");
		hotdogButton = new JRadioButton("Hot Dog");
		
		// to make the RadioButtons discelect when the other is selected, it is necessary to put them in the same
		// group
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburguerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburguerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		this.add(pizzaButton);
		this.add(hamburguerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// when we select a button, what is happening is a ActionEvent, so we can evaluate those with a simple
		// if statement
		
		if(e.getSource() == pizzaButton) {
			System.out.println("Pizza");
		} else if (e.getSource() == hamburguerButton) {
			System.out.println("hamburguer");
		} else if (e.getSource() == hotdogButton) {
			System.out.println("hot dog");
		}
		
	}

}
