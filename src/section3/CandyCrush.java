package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String str2=JOptionPane.showInputDialog("who do you not like in this room?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "tell " + str2 + " I said hi");
		// 3. Ask the user for the name of their best friend
String str3=JOptionPane.showInputDialog(null, "whose your best friend? ");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, str3+ " is realy cool, I know him!");
	} 
}



