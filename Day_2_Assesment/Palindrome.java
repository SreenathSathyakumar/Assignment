package Day_2_Assesment;

public class Palindrome {
	public static void main(String[] args) {
		String word="madam";
		String rev="";
		int length = word.length();
		for (int i = length-1; i>=0; i--) {
			rev=rev+word.charAt(i);
			if (word.equals(rev)) {
				System.out.println("this is palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
		}
	}
}

