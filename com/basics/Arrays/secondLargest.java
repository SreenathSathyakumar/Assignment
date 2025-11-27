package com.basics.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4};
int max= Integer.MIN_VALUE;
int min = Integer.MIN_VALUE;

for(int a:arr) {
	if(a>max) {
		min=max;
		max=a;
	}
	else if(a>min&& a!=max) {
		min=a;
	}
}
System.out.println(min);
		
		
	}

}
