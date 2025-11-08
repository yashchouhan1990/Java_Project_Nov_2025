package com;

public class P02_StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Saras";
		String reverse="";
		
		System.out.println("Given String :"+str);
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse+=str.charAt(i);
		}
		
		System.out.println("Reversed String: "+reverse);
		if(reverse.equalsIgnoreCase(str))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is NOT Palindrome");

	}

}
