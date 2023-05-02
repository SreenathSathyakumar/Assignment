package challenge;

public class Length_of_lastWord {
public static void main(String[] args) {
	String last="this is java";
	String word=last.substring(last.lastIndexOf(" ")+1);
	int l=word.length();
	System.out.println(l);
}
}
