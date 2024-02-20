package comboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// it has to be a array of a reference data type, not a array of primitive values
		// so in order to use a array of integer numbers, it is necessary to use the array 
		// of the Wrapper Class Integer. Or Double instead of double.
		String[] animals = {"dog", "Cat", "Bird"};
		comboBox = new JComboBox(animals); // we can add by the method, or by the constructor
		
		// we have to set the ActionListener to the comboBox
		
		comboBox.addActionListener(this); // the class has ActionListener implemented on itself
		//comboBox.setEditable(true); // makes the field editable for search.
		//System.out.println(comboBox.getItemCount()); // get the item count 
		comboBox.addItem("Horse"); // insert a item on the last index
		comboBox.insertItemAt("Pig", 0); // insert a item on a specific index
		comboBox.setSelectedIndex(0); // set the default index selected when the program first runs
		comboBox.removeItem("Cat"); // remove a Item by the name value
		comboBox.removeItemAt(0); // remove a Item by the index value
		comboBox.removeAll(); // clear the comboBox
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// when we select one option, it is always triggering a event
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()); // shows the String value
			//System.out.println(comboBox.getSelectedIndex()); // shows the index
		}
		
	}

}
