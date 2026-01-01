package com;

import java.util.HashMap;
import java.util.Map;

public class P07_PrintDuplicateElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
		
		// HashMap to store number → its frequency
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		  // Count occurrence
		for ( int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		 // Print duplicate elements
		System.out.println("Duplicate elements and their counts:");
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}
}
