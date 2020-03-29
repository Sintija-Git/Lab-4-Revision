package Lab4Revison;

public class Bootcamp {

	public static void main(String[] args) {
		// declare local variables

		Student s1 = new Student ();
		System.out.println (s1);
		
		Student s2 = new Student ();
		
		Student s3;
		s3 = s1;
		
		s1.setName("SJ");
		String myName;
		myName = s1.getName();
		System.out.println ("s1.name: " + myName);	
		
		myName =s3.getName();
		System.out.println ("s3.name: " + myName);
		
		myName = s2.getName();
		System.out.println ("s2.name: " + myName);
		
		s2.setName("TT");
		System.out.println (s2);
		
		myName = s2.getName();
		System.out.println ("s2.name: " + myName);
		
		Student s4 = new Student ("ED");
		myName = s4.getName();
		System.out.println ("s4	.name: " + myName);
		
	} //end main

} //end class
