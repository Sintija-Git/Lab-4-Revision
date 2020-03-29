package Lab4Revison;

public class CdDiscount {
	private int numCD;
	private int discAmount; //meaning amount of discount
	
	public CdDiscount () { //empty constructor
	}
	
	//set methods for both variables
	public void setNumCD (int numCD) {
		this.numCD = numCD;
	}
	
	public void setDiscAmount (int discAmount) {
		this.discAmount = discAmount;
	}
		
	public void compute() {
		
		if (numCD > 40) {
			discAmount = 50;
			
	} else if (numCD> 20) {
		discAmount = 30;
	} else if (numCD> 10) {
		discAmount = 20;
	} else {
		discAmount = 0;
		
		
	}	//end else if
	} //end compute
		
	public int getDiscAmount()	{
		return discAmount;
	}
	
		
		
	
	
} // end class
