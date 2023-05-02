package Day_2_Assesment;

public class Palindrome {
	public static void main(String[] args) {
		String word="palindrome";
		String rev="";
		for (int i = word.length()-1; i>=0; i--) {
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
