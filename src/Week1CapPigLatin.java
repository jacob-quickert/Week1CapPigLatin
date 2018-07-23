import java.util.Scanner;

public class Week1CapPigLatin {

	public static void main(String[] args) {
		//bring in a scanner object
		Scanner scan = new Scanner(System.in);
		//initialize a userInput variable for clarity
		String userInput;
		//initialize cont as y so the while loop runs at least once
		String cont = "y";

		//set a while loop for user choice to continue
		while (cont.equalsIgnoreCase("y")) {
			
		//prompt user and scan for input
		System.out.println("Please enter a word to translate: ");
		userInput = scan.nextLine();
		
		//convert user word to lowercase
		userInput = userInput.toLowerCase();
		System.out.println("You entered the word " + userInput);		
		
		//call the method to translate word to pig latin and print
		System.out.println(convertWordToPig(userInput));
		
		//prompt a repeat experience
		System.out.println("Would you like to translate another? y/n");
		cont = scan.nextLine();
		}
		
		scan.close();
	}
	
	private static String convertWordToPig(String convertWord) {
		//initialize a string with all vowels for the purpose of checking
		String vowels = "aeiouAEIOU";
		//run a for loop to the length of the word to check for vowels
		for(int i = 0; i < convertWord.length(); i++){
			//check for words that start with vowels
			if(vowels.contains("" + convertWord.charAt(0))) {
				
	        	convertWord = convertWord + "way";
	        	
	        	return convertWord;
			}
			//convert words with with vowels not in the starting position
			else if(vowels.contains("" + convertWord.charAt(i))) {
				
				//substring(i) goes from i to end of word and
				//substring(0, i) goes from the start to the letter before i
            	convertWord = convertWord.substring(i) + convertWord.substring(0,i) + "ay";
            	
            	return convertWord;
            }
		}
		return convertWord;
	}

}
