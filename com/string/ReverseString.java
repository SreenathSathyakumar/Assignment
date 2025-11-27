package com.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word= "sreenath";
String result = "";
for(int i= word.length()-1;i>=0;i--) 
    {
	result = result+word.charAt(i);
	
	}
System.out.println(result);	
}}
