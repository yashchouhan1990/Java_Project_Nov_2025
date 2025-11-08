package com;

public class P01_ReverseString {
	
	public static void main(String[] args) {
		String str = "Welcome To The Java World";
		String rev="";
		
		System.out.println("Original String :"+str);
		for (int i=str.length()-1; i>=0; i--)
		{
			rev+=str.charAt(i);
		}
		
		System.out.println("Reversed String :"+rev);
		
		
		
		//Using inbuilt method
		StringBuilder sb= new StringBuilder("Hello World");
		System.out.println("Reverse String : "+sb.reverse());
		
	}
	
}

/*
Output-
 
Original String :Welcome To The Java World
Reversed String :dlroW avaJ ehT oT emocleW
Reverse String : dlroW olleH

 
 
 */
