package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class P04_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "swiss";
		
		//char result= firstNonRepeatingChar(str);
		
		char result = firstNonRepeatingCharacter(str);
		if(result != 0)
			System.out.println("First Non Repeating Character: "+result);
		else
			System.out.println("No. Non-repeating character found !");

	}
	
	
	public static char firstNonRepeatingChar(String str) {
		 
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		
		// Step1: first count frequency of characters
		
		for(char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
		}
		
		// Step2: Find the first character with frequency = 1 
		
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() == 1)
				return entry.getKey();
		}
		
		return 0;  // No non repeating character
	}
	
	
	// Another approach
	public static char firstNonRepeatingCharacter(String str) {
		 int[] freq = new int[256]; // ASCII Frequency
		 
		 for (char ch : str.toCharArray())
			 freq[ch]++;
		 
		 for (char ch : str.toCharArray()) {
			if(freq[ch] == 1)
				return ch;
		 }
	 
		return 0;
	}
	

}
