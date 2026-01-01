package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hands_On {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Remove duplicates from a string
		Hands_On ho= new Hands_On();
		String str = "Jai Siya Ram";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch :  str.toCharArray()) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
		
		
		
	}

}
