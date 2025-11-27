package com.string;

import java.util.Iterator;

public class Reverse_the_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sent="I am here to win";
String[] words = sent.split(" ");

StringBuilder Finalsent = new StringBuilder();
//String Finalsent= "";
for(String word : words ) {
	String rev="";
	for (int i=word.length()-1;i>=0;i--) {
		rev = rev+word.charAt(i);
		
	}
	Finalsent.append(rev).append(" ");
	
}

System.out.println(Finalsent);
	}

}
