package com;

public class P06_ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Jai Shri Ram Jai Radhey Shyam";
		
		//String reverse= reverseWords(str);
		
		String reverse= reverseWordsInString(str);
		
		System.out.println("Original String : "+ str);
		System.out.println("Reverse words in String : "+ reverse);
		
	}
	
	// 1: Approach one 
	public static String reverseWords( String str) {
		
		String[] words = str.trim().split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		
		for( int i=words.length-1; i>=0; i--) {
			sb.append(words[i]).append(" ");
		}
	
		return sb.toString().trim();
	}
	
	//Another Approach --- I recommend;
	
	public static String reverseWordsInString(String str) {
        // Step 1: Split the string by spaces
        String[] words = str.split(" ");

        // Step 2: Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words
            }
        }

        // Step 3: Return the reversed string
        return reversed.toString();
    }
	

}
