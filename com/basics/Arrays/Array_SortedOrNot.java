package com.basics.Arrays;

public class Array_SortedOrNot {

	public static void main(String[] args) {
int [] arr={2,66,5,39};
boolean flag =false;

for(int i =0;i<arr.length-1;i++) {
	if(arr[i]>arr[i+1]) {
		flag=true;
		break;
	}
}

if(flag) {
	System.out.println("not sorted");
}
else {
	System.out.println("sorted");

}
	}

}
