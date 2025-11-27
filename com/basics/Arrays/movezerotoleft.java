package com.basics.Arrays;

import java.util.Arrays;

public class movezerotoleft {

	public static void main(String[] args) {
int arr[] = {2,0,22,4,0,5,0,3,6};
/*int res[]=new int[arr.length];
int index = res.length-1;
for(int i=0;i<=arr.length-1;i++) {
	if(arr[i]!=0) {
		res[index]=arr[i];
		index--;*/
	

//System.out.println(Arrays.toString(res));

int inspos=0;
for(int i=0;i<arr.length-1;i++) {
	if(arr[i]!=0) {
		arr[inspos]=arr[i];
		inspos++;
	}
}

while(inspos<arr.length) {
	arr[inspos]=0;
	inspos++;
}
System.out.println(Arrays.toString(arr));



	}}


