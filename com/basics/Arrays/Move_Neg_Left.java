package com.basics.Arrays;

import java.util.Arrays;

public class Move_Neg_Left {

	public static void main(String[] args) {
		int [] arr = {2,-6,-5,6,-7,-8};
		int left =0;
		int right = arr.length-1;
		
		while(left<right) {
			if(arr[left]<0)
				left++;
			
			else if(arr[right]>=0)
				right--
				
				;
			
			else {
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
				
				
				left++;
				right--;
				
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
