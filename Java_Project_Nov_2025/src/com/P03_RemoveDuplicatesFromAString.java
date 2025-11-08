package com;

import java.util.HashSet;
import java.util.Set;

public class P03_RemoveDuplicatesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Programing";
	//	String result= removeDuplicates(input);
		
	//	String result= removeDuplicateCharacters(input);
		
		String result= removeDuplicatesUsingHashSet(input);
		
		System.out.println("Original String :"+input);

		System.out.println("After Duplicates Removed String :"+result);
				
	}
	
	
	public static String removeDuplicates(String str)
	{
		
		//To keep track of seen character
		
		StringBuilder result = new StringBuilder();
		boolean[] seen = new boolean[256]; //for all possible ASCII characters (A–Z, a–z, 0–9, special symbols, etc.).
		
		for (int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			if(! seen[ch])
			{	
				seen[ch]=true;
				result.append(ch);
			}
		}
		
		return result.toString();		//Converts the StringBuilder content back into a normal String.
		
	}

/*
 * Explanation

We use a boolean array (seen) of size 256 to track characters (for all ASCII values).

Each character is checked:

If it’s not seen before → add to result.

If already seen → skip it.

Finally, we return the new string without duplicates.
 * 
 * 	
 */
	
	
	//Another approach -Remove Duplicates Using HashSet
	
	public static String removeDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();	//Converts the StringBuilder content back into a normal String.
	}
        /* Explanation
         * 
         * How This Works

HashSet<Character> keeps track of characters you’ve already encountered.

It automatically prevents duplicates because a Set cannot contain the same element twice.

The program loops through every character in the string:

If the character isn’t in the set, add it to seen and append to the result.

If it’s already in the set, skip it.

The final StringBuilder contains only unique characters, in the order of first appearance.
         * 
         * 
         */
        
	
	//Another approach
	
	
	public static String removeDuplicatesUsingHashSet( String str) {
		 
		StringBuilder sb = new StringBuilder();
		 HashSet<Character> seen = new HashSet<Character>();
		 
		 for ( char ch: str.toCharArray()) {
			 if(seen.add(ch))
				 sb.append(ch);
		 }
		
		return sb.toString();  	//Converts the StringBuilder content back into a normal String.
	}
}

/*
Step-by-Step Explanation
1️⃣ StringBuilder sb = new StringBuilder();

Creates a mutable string object that efficiently builds the final result.

You use StringBuilder instead of String concatenation (+) because it avoids creating multiple intermediate strings — much faster in loops.

2️⃣ HashSet<Character> seen = new HashSet<Character>();

Creates an empty HashSet to store characters that have already appeared.

A Set automatically ensures no duplicates — it can only contain unique elements.

Every time you try to add() a character:

If it’s new → it gets added, and add() returns true

If it already exists → it’s ignored, and add() returns false

3️⃣ for (char ch : str.toCharArray())

Converts the string into a character array and loops through each character one by one.

This is a simple and efficient way to iterate over all characters in a string.

4️⃣ if (seen.add(ch)) sb.append(ch);

This line does two things at once — that’s what makes it elegant.
Final result → "progamin"

So the if (seen.add(ch)) line cleverly checks and adds at once.
It’s equivalent to:
if (!seen.contains(ch)) {
    seen.add(ch);
    sb.append(ch);
} 
 
5️⃣return sb.toString();

Converts the StringBuilder content back into a normal String.

This is your final string without duplicates.

 */

/*Output-
 * 
Original String :Programing
After Duplicates Removed String :Progamin
 */
