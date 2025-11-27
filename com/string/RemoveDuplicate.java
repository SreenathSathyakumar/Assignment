package com.string;

import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
        String result = "";

        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1)
                result += c;
        }
        System.out.println("After removing duplicates: " + result);
				
		}
	}


