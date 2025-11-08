package com;

import java.util.HashMap;
import java.util.Map;

public class P05_CountOccuranceOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is Yash Chouhan";
		
		str=str.replace(" ", "");
		char[] chArray = str.toCharArray();
		System.out.println(str);
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(char c : chArray)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
		else
				map.put(c, 1);
		}
		
		//Occurrence of each character in string
		for(Map.Entry<Character, Integer> entry : map.entrySet() )
		{
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}
		
		System.out.println("*******");
		
		//Print the occurrence of each characters from String
		for(Map.Entry<Character, Integer> entry1 : map.entrySet() )
		{
			if(entry1.getValue()>1)
			{
				System.out.println(entry1.getKey() + ":"+ entry1.getValue());
			}
		}
		
		
	}

}

/*
 
 Output-
 
 MynameisYashChouhan
a:3
C:1
e:1
h:3
i:1
M:1
m:1
n:2
o:1
s:2
u:1
y:1
Y:1
*******
a:3
h:3
n:2
s:2


 * 
 */
