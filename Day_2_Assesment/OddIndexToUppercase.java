package Day_2_Assesment;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String word="selenium";
		char[] charArray = word.toCharArray();
		for (int i = 1; i < charArray.length; i=i+2) {
			charArray[i]=Character.toUpperCase(charArray[i]);
		}
		System.out.println(new String(charArray));
	}

}
