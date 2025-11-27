package Day_2_Assesment;

public class SumofDigitsFromString {

	public static void main(String[] args) {
		String text = "madam";
		String rev = "";
		for(int i=text.length()-1;i>=0;i--)
		{
		 rev = rev+ text.charAt(i);
	    }
		if(text.equalsIgnoreCase(rev))
		{
			System.out.println(rev+ " is a Palindrome");	
		}
		else
		{
			System.out.println(rev+ " is not a Palindrome");	
		}
}

}

	
//	String word = "nu2mb33e4r";
//	int sum=0;
//	String replace = word.replaceAll("\\D", " ");
//	System.out.println("number of words:"+replace);
//	char[] charArray = replace.toCharArray();
//	for (char c : charArray) {
//		int num = Character.getNumericValue(c);
//		 sum += num;
//	}
//}