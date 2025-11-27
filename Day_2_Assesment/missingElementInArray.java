package Day_2_Assesment;

import java.util.Arrays;
import java.util.Iterator;

public class missingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = {1,2,3,6,8};
 Arrays.sort(arr);
 for (int i = 0; i < arr.length; i++) {
	if (i+1 !=arr[i]) {
		System.out.println(i+1);
		break;
	}
}
	}

}
