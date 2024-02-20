package continuationOfTheStudy;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyDialogBoxJOptionPane {

	public static void main(String[] args) {
		
		// JOptionPane =  pop up a standard dialog box that prompts users for a value
		//				  or informs them of something
		
		//					parent component, 		message,			   title,         styling/messageType
		//JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.QUESTION_MESSAGE);
		//while(true) {
			//JOptionPane.showMessageDialog(null, "Yout PC has a Russian virus!", "Title", JOptionPane.WARNING_MESSAGE);
		//}
		
		//JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.ERROR_MESSAGE);
		//						parent component,  			message,  				       title,         response buttons type
		//JOptionPane.showConfirmDialog(null, "ninguem sabe como esta a mente do palhaco", "Meu titulo",JOptionPane.YES_NO_CANCEL_OPTION);
		
		// when the one of the buttons are pressed, it returns integer values:
		// yes    returns 0
		// no     returns 1
		// cancel returns 2
		//System.out.println(JOptionPane.showConfirmDialog(null, "ninguem sabe como esta a mente do palhaco", "Meu titulo",JOptionPane.YES_NO_CANCEL_OPTION));
		
		//so with that we can code some options 

		// that's how it is stored response values on this boxes
		//int answer = JOptionPane.showConfirmDialog(null, "ninguem sabe como esta a mente do palhaco", "Meu titulo",JOptionPane.YES_NO_CANCEL_OPTION);
		
		// that's how it is stored user typed values with JOptionPane
		//String name = JOptionPane.showInputDialog("What is your name?");
		//System.out.println("Hello " + name);
		
		//String[] responses = new String[3];
		String[] responses = {"Elon?", "FDP!", "Seu broxa >:("};
		ImageIcon image = new ImageIcon("elon.png");
		
		// 						parent component, message,                 title,					    response buttons type,    styling/messageType,		 icon, options, initial value selected
		JOptionPane.showOptionDialog(null, "Comprei teu Monza!", "shhhh, mensagem secreta", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE , image, responses, 0);
	
	}

}
