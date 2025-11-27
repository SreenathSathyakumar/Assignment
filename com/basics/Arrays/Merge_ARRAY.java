package com.basics.Arrays;

import java.util.Arrays;

public class Merge_ARRAY {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4};
		int [] arr2 = {5,6,7};
		
		int[] merged = new int[arr1.length+arr2.length];
for(int i=0;i<arr1.length;i++) {
	merged[i]= arr1[i];
}
for(int j=0;j<arr2.length;j++) {
	merged[arr1.length+j]=arr2[j];
}

System.out.println(Arrays.toString(merged));
	}

}
