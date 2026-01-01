package com;

import java.util.HashMap;
import java.util.Map;

public class Test {

			public static void main(String[] args) {
				
				int[] arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
				
				
				HashMap<Integer, Integer> map = new HashMap();
				
				for ( int num : arr) {
					map.put(num, map.getOrDefault(num, 0)+1);
				}
				
				for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
					if(entry.getValue() != 1)
					{
						System.out.println(entry.getKey()+" : "+entry.getValue());
					}
				}
			}

}
