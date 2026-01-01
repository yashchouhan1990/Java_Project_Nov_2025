package com;

public class P07_ReverseString_KeepOrderSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original= "I love India";
		String reverseString="";
		
		String[] words=original.split(" ");
		System.out.println("Original String :"+original);
		
		for(int i=0; i< words.length; i++) {
			
			//Taking each word and reversing it
			String word = words[i];
			String reverseword="";
			
			for (int j=word.length()-1; j>=0; j--) {
				reverseword= reverseword + word.charAt(j);
				
			}
			// Appending word
			reverseString= reverseString + reverseword + " ";
				
		}
		
		System.out.println("Reversed String :"+ reverseString);
		

	}

}
