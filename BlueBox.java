package Lab4Revison;

public class BlueBox {

	public static void main(String[] args) {
		
	Box defaultBox = new Box ()	;
		
	System.out.println (defaultBox.compute());	//here the value has been taken from constructor in the Box class
		
	
	Box smallBox = new Box (5,5,2);
	
	System.out.println(smallBox.compute()); //here you can provide values in the new oblect
	
	
	
	} //end main
} //end class
