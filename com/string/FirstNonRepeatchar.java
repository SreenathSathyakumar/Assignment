package com.string;

public class FirstNonRepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "sreeanth";
	name.toLowerCase();
		for(char c: name.toCharArray()) {
			if(name.indexOf(c)==name.lastIndexOf(c)) {
				System.out.println(c);
				return;
			}
			
		}

	}

}
