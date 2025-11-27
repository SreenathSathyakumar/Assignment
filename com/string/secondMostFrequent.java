package com.string;

import java.util.HashMap;
import java.util.Map;

public class secondMostFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mhfvh";
		Map<Character, Integer> counts = new HashMap<>();
	    for (char c : str.toCharArray()) 
	    	counts.put(c, counts.getOrDefault(c, 0) + 1);

	    int firstMax = 0, secondMax = 0;
	    char res = '\0';

	    for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
	        int val = entry.getValue();
	        if (val > firstMax) {
	            secondMax = firstMax;
	            firstMax = val;
	        } else if (val > secondMax && val < firstMax) {
	            secondMax = val;
	            res = entry.getKey();
	        }
	    }
	    System.out.println("2nd Most Frequent: " + res);

}}
