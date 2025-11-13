/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function. 
		
		System.out.println(isAnagram("1001","1001"));  // true
		//System.out.println(isAnagram("William 1","I am a weakish speller")); // true
		//System.out.println(isAnagram("Madam Curie","Radium came")); // true
		//System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemor")); // true


		/* 
		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "123";
		Boolean pass = true;
		
		
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");*/
	}  
		
	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		// Replace the following statement with your code
		str1 = preProcess(str1);
		str2 = preProcess(str2);
		int i = 0;
		boolean anagramCheck = false;

			if (str1.length() == str2.length()){
				while (i < str1.length()) {
					if (str2.indexOf(str1.charAt(i)) == -1){
						break;
					}
					else anagramCheck = true;
					if (str2.length() == 1 ){
						break;
					}
					i++;
				}
			}
	
		return anagramCheck;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
		String trashCan = "";
		String proccesedString = "";

		for (int i = 0; i < (str.length()); i++) {
			str = str.toLowerCase();
			if (alphabet.indexOf(str.charAt(i)) == -1){
				trashCan += str.charAt(i);
			}
			if (trashCan.indexOf(str.charAt(i)) == -1){
				proccesedString += str.charAt(i);
			}
		}


		return proccesedString;

	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	//  characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		str = preProcess(str);
		String newString = "";
		String valString = "";
		int i = 0;
		//yoad
		while (i < (str.length())) {

			double n = Math.floor(str.length()*Math.random());
			int value = (int)n;
			char strVal = (char)value;

				
			if (valString.indexOf(strVal) == -1){
				newString += str.charAt(value);
				valString += strVal;
				i++;
			}
			
			if (newString.length() == str.length()){
				break;
			}
				

		}		

		
		
		return newString;
	}
}