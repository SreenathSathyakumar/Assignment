package com.basics.Arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1,2,3,4,5};
int start =0;
int end=a.length -1;
while(start<end) {
	
	int temp= a[start];
	a[start]= a[end];
	a[end]= temp;
	
	start++;
	end--;
	
}
System.out.println(Arrays.toString(a));

	}

}
