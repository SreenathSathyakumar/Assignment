package com.string;

import java.util.HashMap;

public class MostRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "Representation";
HashMap<Character,Integer> map = new HashMap();

for(char c: name.toCharArray()) {
	map.put(c, map.getOrDefault(c, 0)+1);
}
System.out.println(map);
int maxcount=0;
char character=' ';
for(char ch : map.keySet() ) {
	if(maxcount < map.get(ch)) {
		maxcount=map.get(ch);
		character = ch;
	}
	
}
System.out.println(maxcount +" " +character);

	}

}
