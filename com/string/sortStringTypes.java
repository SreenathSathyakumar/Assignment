package com.string;

public class sortStringTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String vovel="";
String CONSONENT="";
String spec="";
String word = "representati$%on";
for (char c : word.toCharArray()) {
	if(Character.isLetter(c)) {
		if("AEIOUaeiou".indexOf(c)!= -1) {
			vovel += c;
		}
		else {
			CONSONENT+=c;}
		
	}
	else {
		spec += c;}
		}

System.out.println(vovel+CONSONENT+spec);
}


}
