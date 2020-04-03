package Lab4Revison;
import java.util.Scanner;
/*
Extra work on Characters, Strings and StringBuffers.
Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence. Use instantiable classes.
For example, if input is "I learn Java"
the output is:
"IlearnJava"
SpacesRemoverApp is an application which does the following tasks
-- prompts the user to input a sentence
-- uses the instantiable class SpacesRemover to create a word by removing all the spaces from the sentence
-- retrieves the word and dipslays it
*/
public class SpacesRemoverApp {
	
	public static void main(String args[]){
   
		String sentence, word;
		StringBuffer sb = new StringBuffer();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter a sentence here: ");
		sentence = sc.nextLine();
		
		SpacesRemover mySpace = new SpacesRemover();
		mySpace.setSentence(sentence);
		mySpace.transformation();
		
		System.out.println("The word is: " + mySpace.getWord());
		
	} // end main

} // end class
