package com.string;

public class Titlecase {

	public static void main(String[] args) {
String sentence = "tis is title case";
String result="" ;
for(String word : sentence.toLowerCase().split(" ")) {
	result= result+word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase()+" ";
}
System.out.println(result);
	}

}
