package Lab4Revison;
	/*
	Extra work on Characters, Strings and StringBuffers.
	Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence Use instantiable classes.
	For example, if input is "I learn Java"
	the output is:
	"IlearnJava"
	SpacesRemover -- the instantiable class: given a sentence, creates a new word by removing all the spaces from the sentence
	*/
	
	  
	public class SpacesRemover { 
		String sentence, word; // declare data members / instance variables
		int capac;
		
		public SpacesRemover() {  // declare a constructor without parameters
		this.sentence = "";    // initialize the sentence with the empty string, otherwise the sentence instance variable is initialized with null
		this.word = "";      // initialize the word with the empty string, otherwise the word instance variable is initialized with null
		}

	// declare setter methods and getter methods

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getWord() {
		return word;
	} 
	        
	 public void transformation() {
		 
		 int len = sentence.length();
		 
		 StringBuffer sb = new StringBuffer();
		
	  for (int i = 0; i < len; i++ ) {
			 char c = sentence.charAt(i);
			 if (c == ' ') {
			     sb.append("");
			 }else {
			     sb.append(c);
			  }
		 }//for
	
		word = sb.toString();
		
	 }//end transf

} //end class
