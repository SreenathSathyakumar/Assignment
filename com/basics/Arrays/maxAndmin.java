package com.basics.Arrays;

public class maxAndmin {
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,8};
		int max=arr[0];
		int min= arr[0]; 
		
		for(int i = 0;i< arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("maximum"+max);
		System.out.println("minimum"+min);
}
}