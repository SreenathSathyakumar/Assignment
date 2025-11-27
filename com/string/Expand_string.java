package com.string;

public class Expand_string {

	public static void main(String[] args) {
		String word = "a4f4h6";
		String result = "";
		
		for(int i=0;i<word.length();i=i+2) {
			char ch = word.charAt(i);
			
			int count = Character.getNumericValue(word.charAt(i+1));
			
			for(int j=0;j<count;j++) {
				result=result+ch;
			
			}
			
		}
		System.out.println(result);
	}

}
