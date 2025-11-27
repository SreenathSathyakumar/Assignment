package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class numberofoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "sreenath";
Map <Character,Integer> MAP = new LinkedHashMap();
for (char c: name.toCharArray()) {
MAP.put(c, MAP.getOrDefault(c, 0)+1);
	}
System.out.println(MAP);
}}
