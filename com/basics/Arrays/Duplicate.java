package com.basics.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,3,4};
Set<Integer> num = new HashSet<>();
		for(int a : arr) {
			
			//num.add(a);
			if(num.add(a)==false) {
				System.out.println(a);
			}
		}
System.out.println(num);
	}

}
