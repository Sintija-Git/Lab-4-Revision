package Lab4Revison;
import javax.swing.JOptionPane;

public class CdDiscountApp {

	public static void main(String[] args) {
		// declare variables
		int numcd, discamt;
		
		// do..while meth
		
		char r;
		
		do {
			
			CdDiscount myDiscount = new CdDiscount (); //object
			
			//input, but with pop up screen
			numcd = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of CD's you want to purcahse"));
			
			myDiscount.setNumCD(numcd);
			
			myDiscount.compute(); //process
			
	
			//output
			discamt = myDiscount.getDiscAmount();
			
			//show message to our JOptinPanel
			JOptionPane.showMessageDialog(null, 
					"By purchasing " + numcd + " CD's your discount will be " + discamt + " % " );
			
			r = JOptionPane.showInputDialog(null, "Do you want to continue shopping?").charAt(0);
			
			
		} while (r== 'y' || r== 'Y');

	} //end main

} //end class
