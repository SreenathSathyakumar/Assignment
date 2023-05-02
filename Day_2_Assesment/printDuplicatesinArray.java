package Day_2_Assesment;

import java.util.Arrays;

public class printDuplicatesinArray {
public static void main(String[] args) {
	int arr[]= {14,13,22,14,8,22,9,4,9};
	Arrays.sort(arr);
	for (int i = 0; i < arr.length-1; i++) {
		if (arr[i]==arr[i+1]) {
			System.out.println(arr[i]);
		}
	}
}
}
