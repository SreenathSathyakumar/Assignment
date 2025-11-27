package com.string;

public class segrigateNumAlpSpec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Alphabets ="";
String digits ="";
String spec = "";

String word="2fbh4$NJKD6";

for(int i=0;i<=word.length()-1; i++) {
	if(Character.isAlphabetic(word.charAt(i))) {
		Alphabets=Alphabets+word.charAt(i);
	}
	else if(Character.isDigit(word.charAt(i))){
		digits=digits+word.charAt(i);
	}
	else
	spec = spec+ word.charAt(i);
}
System.out.println(Alphabets+" "+digits+" "+spec );
}
}