package com.basics.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortArray {

	public static void main(String[] args) {
		int[] arr= {100,5,44,3,21};
		
		/*
		 * for(int i=0;i<arr.length-1;i++) { for(int j=0;j<arr.length-i-1;j++) {
		 * if(arr[j]>arr[j+1]) { int temp = arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp;
		 * 
		 * } } }
		 */
		Set <Integer> sort = new TreeSet<>();
		for(int sorted: arr) {
			sort.add(sorted);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sort);
}}
